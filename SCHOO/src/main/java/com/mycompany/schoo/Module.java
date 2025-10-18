    package com.mycompany.schoo;

    import java.io.Serializable;
    import java.util.ArrayList;
    import java.util.List;

    public class Module implements Serializable {
        private  int moduleID;
        private String modulename;
        private int capacity;
        private List<Student> studentsinmodule ;
        private String timeSlot;
        private Teacher assignedTeacher;





        public static List<Module> modules = new ArrayList<>() ;

       public Module(int moduleID, String moduleName, int capacity, Teacher assignedTeacher, String timeSlot) {
        this.moduleID = moduleID;
        this.modulename = moduleName;
        this.capacity = capacity;
        this.assignedTeacher = assignedTeacher;
        this.timeSlot = timeSlot;
        this.studentsinmodule = new ArrayList<>();
    }


        public void setmoduleID (int moduleID){

            this.moduleID = moduleID ; 
        }

        public String getTimeSlot() {
            return timeSlot;
        }

        public void setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
        }

        public int getmoduleID(){

            return moduleID ; 
        }

        public String getmoduleName() {
            return modulename;
        }

        public void setmoduleName(String name) {
            this.modulename = name;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

       public List<Student> getStudents() {
        return new ArrayList<>(studentsinmodule); 
    }

       public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(Teacher teacher) {
        this.assignedTeacher = teacher;
    }





        public boolean checkCapacity() {
            return studentsinmodule.size() < capacity;
        }

    public boolean addModuleWithTeacher(int moduleID, String moduleName, int capacity, String teacherID, String timeSlot) {
        for (Teacher teacher : Teacher.teacher) {
            if (teacher.getID().equals(teacherID)) {


                boolean moduleExists = false;
                for (Module m : Module.modules) {
                    if (m.getmoduleID() == moduleID) {
                        moduleExists = true;
                        break;
                    }
                }

                if (!moduleExists) {
                    Module module = new Module(moduleID, moduleName, capacity, teacher, timeSlot);
                    Module.modules.add(module);
                    teacher.getAssignedModules().add(module);
                    System.out.println(" Module '" + moduleName + "' added and assigned to teacher: " + teacher.getName());
                    return true;
                } else {
                    System.out.println("️ Module with ID " + moduleID + " already exists.");
                    return false;
                }
            }
        }

        System.out.println(" Teacher with ID " + teacherID + " not found.");
        return false;
    }


    public void addStudent(String studentID) {

        for (Student student : Student.students) {
            if (student.getID().equals(studentID)) {

                boolean alreadyEnrolled = false;
                for (Student enrolledStudent : studentsinmodule) {
                    if (enrolledStudent.getID().equals(studentID)) {
                        alreadyEnrolled = true;
                        break;
                    }
                }

                if (alreadyEnrolled) {
                    System.out.println(" Student is already enrolled in this module.");
                    return;
                }

                if (checkCapacity()) {
                    studentsinmodule.add(student);
                    System.out.println(" Student " + student.getName() + " added to module: " + this.getmoduleName());
                } else {
                    System.out.println(" Cannot add student: Module is full.");
                }
                return;
            }
        }

        System.out.println(" Student with ID " + studentID + " not found in the system.");
    }



    public void removeStudent(String studentID) {
        for (Student student : studentsinmodule) {
            if (student.getID().equals(studentID)) {
                studentsinmodule.remove(student);
                System.out.println("Student " + student.getName() + " removed from module: " + this.getmoduleName());
                return;
            }
        }
        System.out.println("No student with ID " + studentID + " is enrolled in this module.");
    }

    @Override
    public String toString() {
        return "Module[ID=" + moduleID + ", Name=" + modulename + ", Capacity=" + capacity + ", Enrolled=" + studentsinmodule.size() + "]";
    }

    }
