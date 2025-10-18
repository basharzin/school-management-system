package com.mycompany.schoo;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Enrollment {
    private static int addEnrollment = 1;
    private int enrollmentID;
    private Student student;
    private Module module;
    private String date;

    private static List<Enrollment> enrollments = new ArrayList<>();

    public Enrollment(Student student, Module module, String date) {
        this.enrollmentID = addEnrollment++;
        this.student = student;
        this.module = module;
        this.date = date;
        enrollments.add(this);
    }

    public static void enrollStudent(Student student, Module module, String date) {
        if (module.checkCapacity()) {
            new Enrollment(student, module, date);
            student.enrollModule(module.getmoduleID());
            System.out.println("Student Enrolled.");
        } else {
            System.out.println("Enrollment Failed. Module is full.");
        }
    }

    public static void cancelEnrollment(Student student, Module module) {
        enrollments.removeIf(e -> e.student == student && e.module == module);
        student.cancelEnrollment(module.getmoduleID());
        System.out.println("Enrollment Cancelled.");
    }

   public static void updateEnrollment(Student student, Module oldModule, Module newModule, String newDate) {
    if (oldModule.equals(newModule)) {
        System.out.println("Student is already enrolled in " + newModule.getmoduleName());
        return;
    }
    cancelEnrollment(student, oldModule);
    enrollStudent(student, newModule, newDate);
    System.out.println("Enrollment Updated.");
}

}