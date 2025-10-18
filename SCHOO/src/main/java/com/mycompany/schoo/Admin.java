 package com.mycompany.schoo;

import static com.mycompany.schoo.Module.modules;
import static com.mycompany.schoo.Student.students;
import static com.mycompany.schoo.Teacher.teacher;
 
 import com.mycompany.schoo.Admin;

import com.mycompany.schoo.Student;

import com.mycompany.schoo.Teacher;

 
import java.util.ArrayList;
import java.util.List;




public class Admin extends Person {

     public static  List<Admin> Admins = new ArrayList<>() ;
     
    public Admin(String ID, String name, String email, String username, String password) {
        super(ID, name, email, username, password); 
        Admins.add(this) ;
    }
    
   
    
public boolean addModuleWithTeacher(int moduleID, String moduleName, int capacity, String teacherID, String timeSlot) {
    for (Teacher teacher : Teacher.teacher) {
        if (teacher.getID().equals(teacherID)) {

            for (Module module : Module.modules) {
                if (module.getmoduleID() == moduleID) {
                    System.out.println("️ Module with ID " + moduleID + " already exists.");
                    return false;
                }
            }

            Module newModule = new Module(moduleID, moduleName, capacity, teacher, timeSlot);
            Module.modules.add(newModule);
            teacher.getAssignedModules().add(newModule);
            FileManager.saveModules("modules.dat", Module.modules);
            System.out.println("Module '" + moduleName + "' added, assigned, and saved successfully.");
            return true;
        }
    }
    System.out.println(" Teacher with ID " + teacherID + " not found.");
    return false;
}



public boolean createTeacherAccount(String ID, String name, String email, String subject, String username, String password) {
    for (Teacher teacher : Teacher.teacher) {
        if (teacher.getID().equals(ID)) {
            System.out.println("Teacher with ID " + ID + " is already in the system.");
            return false;
        }
        if (teacher.getEmail().equalsIgnoreCase(email)) {
            System.out.println("Email " + email + " is already registered.");
            return false;
        }
        if (teacher.getUsername().equalsIgnoreCase(username)) {
            System.out.println("Username " + username + " is already taken.");
            return false;
        }
    }

    Teacher newTeacher = new Teacher(ID, name, email, subject, username, password);
    Teacher.teacher.add(newTeacher);
    FileManager.saveTeachers("teachers.dat", Teacher.teacher);
    System.out.println("Teacher " + newTeacher.getID() + " - " + newTeacher.getName() + " added and saved successfully.");
    return true;
}



    
 public void createStudentAccount(String ID, String name, String email, String username, String password, String dateOfBirth, String gender) {
    for (Student student : Student.students) {
        if (student.getID().equals(ID)) {
            System.out.println(" Student with ID " + ID + " is already in the system.");
            return;
        }
    }

    Student newStudent = new Student(ID, name, email, username, password, dateOfBirth, gender);
    Student.students.add(newStudent);
    FileManager.saveStudents("Students.txt", Student.students);
    System.out.println(" Student " + newStudent.getID() + " - " + newStudent.getName() + " added and saved successfully.");
}




    public boolean removeModule(String modulename) {
    if (modules.isEmpty()) {
        System.out.println("Module not found");
        return false;
    }
    
    for (int i = 0; i < modules.size(); i++) {
        if (modules.get(i).getmoduleName()== modulename) {
            modules.remove(i);
            System.out.println("Module removed successfully.");
            return true; 
        }
    }
    
    System.out.println("Module name " + modulename + " not found.");
    return false;
}

   public boolean updateModuleDetails(int moduleID, String newName) {
        for (Module module : modules) {
            if (module.getmoduleID() == moduleID) {
                module.setmoduleName(newName); 
                System.out.println("Module ID " + moduleID + " updated to '" + newName + "'.");
                return true ;
            }
        }
        System.out.println("Module with ID " + moduleID + " not found.");
        return false ;
    }

public boolean addStudentToModule(String studentID, int moduleID) {
    for (Student student : Student.students) {
        if (student.getID().equals(studentID)) {
            
            for (Module module : Module.modules) {
                if (module.getmoduleID() == moduleID) {

                    if (module.getStudents().contains(student)) {
                        System.out.println("️ Student " + student.getName() + " is already enrolled in module: " + module.getmoduleName());
                        return false;
                    }

                    if (module.checkCapacity()) {
                        module.addStudent(studentID);  
                        System.out.println(" Student " + student.getName() + " has been added to module: " + module.getmoduleName());
                    } else {
                        System.out.println(" Enrollment failed: Module '" + module.getmoduleName() + "' is full.");
                        return false ; 
                    }
                    return true ;
                }
            }

            System.out.println(" Module with ID " + moduleID + " not found.");
            return false;
        }
    }

    System.out.println(" Student with ID " + studentID + " not found.");
    return false ; 
}

public String generateReports(String moduleName) {
    System.out.println("Looking for module: " + moduleName);

    for (Module module : modules) {
        System.out.println("Checking against: " + module.getmoduleName());

        if (module.getmoduleName().trim().equalsIgnoreCase(moduleName.trim())) {
            StringBuilder report = new StringBuilder();
            report.append("Report for Module: ").append(module.getmoduleName()).append("\n");
            report.append("Capacity: ").append(module.getCapacity()).append("\n");
            report.append("Enrolled Students: ").append(module.getStudents().size()).append("\n");

            if (module.checkCapacity()) {
                report.append("Status: Module still has available slots.\n");
            } else {
                report.append("Status: Module has reached maximum capacity.\n");
            }

            return report.toString();
        }
    }

    return "Module '" + moduleName + "' not found.";
}




}
