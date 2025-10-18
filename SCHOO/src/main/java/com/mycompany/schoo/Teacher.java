package com.mycompany.schoo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String subject;

    public static List<Teacher> getTeacher() {
        return teacher;
    }

   
    
    
    private List<Module> assignedModules;

    public static  List<Teacher> teacher = new ArrayList<>() ;
     
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Module> getAssignedModules() {
        return assignedModules;
    }

    public void setAssignedModules(List<Module> assignedModules) {
        this.assignedModules = assignedModules;
    }

    public Teacher(String ID, String name, String email, String subject, String username, String password) {
        super(ID, name, email, username, password); 
        this.subject = subject;
        this.assignedModules = new ArrayList<>();
        teacher.add(this) ;
    }

   public void assignModule(int moduleID) {
    for (Module module : Module.modules) {
        if (module.getmoduleID() == moduleID) {

           
            boolean alreadyAssigned = false;
            for (Module assigned : assignedModules) {
                if (assigned.getmoduleID() == moduleID) {
                    alreadyAssigned = true;
                    break;
                }
            }

            if (!alreadyAssigned) {
                assignedModules.add(module);
                System.out.println(" Module assigned to teacher: " + module.getmoduleName());
            } else {
                System.out.println(" This module is already assigned to the teacher.");
            }
            return;
        }
    }
    System.out.println(" Module with ID " + moduleID + " not found.");
   }
}
