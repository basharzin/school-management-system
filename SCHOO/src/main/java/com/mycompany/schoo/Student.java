package com.mycompany.schoo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Serializable {
    private List<Module> enrolledModules;
    public static List<Student> students = new ArrayList<>();

    private String dateOfBirth;
    private String gender;

    public Student(String ID, String name, String email, String username, String password, String dateOfBirth, String gender) {
        super(ID, name, email, username, password);
        this.enrolledModules = new ArrayList<>();
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        students.add(this);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
public void enrollModule(int moduleID) {
    for (Module module : Module.modules) {
        if (module.getmoduleID() == moduleID) {

           
            boolean alreadyEnrolled = false;
            for (Module enrolled : enrolledModules) {
                if (enrolled.getmoduleID() == moduleID) {
                    alreadyEnrolled = true;
                    break;
                }
            }

            if (alreadyEnrolled) {
                System.out.println("️ You are already enrolled in: " + module.getmoduleName());
                return;
            }

            
            if (module.checkCapacity()) {
                enrolledModules.add(module);
                module.addStudent(this.getID());
                System.out.println(" Enrolled in module: " + module.getmoduleName() + " (Time: " + module.getTimeSlot() + ")");
            } else {
                System.out.println(" Module is full: " + module.getmoduleName());
            }

            return;
        }
    }

    System.out.println(" Module with ID " + moduleID + " not found.");
}




    public void cancelEnrollment(int moduleID) {
    for (Module module : enrolledModules) {
        if (module.getmoduleID() == moduleID) {
            enrolledModules.remove(module);
            module.removeStudent(this.getID());
            System.out.println(" Enrollment canceled for module: " + module.getmoduleName());
            return;
        }
    }
    System.out.println(" You are not enrolled in a module with ID: " + moduleID);
}


   public void updateEnrollment(int oldModuleID, int newModuleID) {
  
    boolean foundOld = false;
    for (Module module : enrolledModules) {
        if (module.getmoduleID() == oldModuleID) {
            enrolledModules.remove(module);
            module.removeStudent(this.getID());
            System.out.println(" Removed from old module: " + module.getmoduleName());
            foundOld = true;
            break;
        }
    }

    if (!foundOld) {
        System.out.println("️ Not enrolled in module with ID: " + oldModuleID);
    }

    
    for (Module module : Module.modules) {
        if (module.getmoduleID() == newModuleID) {
            if (module.checkCapacity()) {
                enrolledModules.add(module);
                module.addStudent(this.getID());
                System.out.println("Enrolled in new module: " + module.getmoduleName());
            } else {
                System.out.println(" Cannot enroll in new module: Capacity full.");
            }
            return;
        }
    }

    System.out.println(" Module with ID " + newModuleID + " not found.");
}

public void viewCourses() {
    System.out.println("? Student " + getName() + " is enrolled in:");

    if (enrolledModules.isEmpty()) {
        System.out.println("️ No modules enrolled.");
        return;
    }

    for (Module module : enrolledModules) {
        System.out.println("- " + module.getmoduleName() + " (ID: " + module.getmoduleID() + ")");
    }
}

   
}
