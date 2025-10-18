//
//package com.mycompany.schoo;
//
//import java.util.List;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Scanner;
//import static com.mycompany.schoo.Module.modules;
//import static com.mycompany.schoo.Student.students;
//import static com.mycompany.schoo.Teacher.teacher;
//import static com.mycompany.schoo.Admin.Admins ; 
//
//
//
//public class SCHOO {
//    public static void main(String[] args) {
//        
//       Person x = new Person ();
//      Admin admin = new Admin("A001", "zain", "zain@school.com", "zain", "123");     
//         
//   FileManager.loadStudents("Students.txt");
//    FileManager.loadTeachers("teachers.dat");
//    FileManager.loadModules("modules.dat");
//    
//     
//         
//        Scanner input = new Scanner(System.in);
//        
//   
//        
//       
//        
//        System.out.println("Admin : " + Admin.Admins.size());
//          System.out.println("teacher" + Teacher.teacher.size());
//          System.out.println("Module : " + Module.modules.size());
//        boolean running = true;
//
//        while (running) {
//            System.out.println("Welcome to SCHOO System");
//            System.out.println("1. Login as Admin");
//            System.out.println("2. Login as Student");
//            System.out.println("3. Login as Teacher");
//            System.out.println("4. Exit");
//            System.out.print("Choose your role: ");
//            int roleChoice = input.nextInt();
//            input.nextLine();
//
//            switch (roleChoice) {
//                case 1:
//                    System.out.print("Enter Admin username: ");
//                    String aUser = input.nextLine();
//                    System.out.print("Enter password: ");
//                    String aPass = input.nextLine();
//
//                    if (admin.getUsername().equals(aUser) && admin.getPassword().equals(aPass)) {
//                        System.out.println("Logged in as Admin");
//                        boolean adminSession = true;
//                        while (adminSession) {
//                            System.out.println("Admin Menu:");
//                            System.out.println("1. Add Module with Teacher");
//                            System.out.println("2. Add Student to Module");
//                            System.out.println("3. View All Modules");
//                            System.out.println("4. Generate Report");
//                            System.out.println("5. Logout");
//                            System.out.print("Choice: ");
//                            int adminChoice = input.nextInt();
//                            input.nextLine();
//
//                            switch (adminChoice) {
//                                case 1:
//                                    System.out.print("Enter module ID: ");
//                                    int mID = input.nextInt();
//                                    input.nextLine();
//                                    System.out.print("Enter module name: ");
//                                    String mName = input.nextLine();
//                                    System.out.print("Enter capacity: ");
//                                    int cap = input.nextInt();
//                                    input.nextLine();
//                                    System.out.print("Enter teacher ID: ");
//                                    String tID = input.nextLine();
//                                    System.out.print("Enter time slot: ");
//                                    String time = input.nextLine();
//
//                                    admin.addModuleWithTeacher(mID, mName, cap, tID, time);
//                                    break;
//
//                                case 2:
//                                    System.out.print("Enter student ID: ");
//                                    String sID = input.nextLine();
//                                    System.out.print("Enter module ID: ");
//                                    int modID = input.nextInt();
//                                    input.nextLine();
//                                    admin.addStudentToModule(sID, modID);
//                                    break;
//
//                                case 3:
//                                    for (Module m : Module.modules) {
//                                        System.out.println(m);
//                                    }
//                                    break;
//
//                                case 4:
//                                    System.out.print("Enter module name for report: ");
//                                    String reportName = input.nextLine();
//                                    admin.generateReports(reportName);
//                                    break;
//
//                                case 5:
//                                    adminSession = false;
//                                    break;
//
//                                default:
//                                    System.out.println("Invalid choice.");
//                            }
//                        }
//                    } else {
//                        System.out.println("Invalid admin credentials.");
//                    }
//                    break;
//
//                case 2:
//                    System.out.print("Enter Student username: ");
//                    String sUser = input.nextLine();
//                    System.out.print("Enter password: ");
//                    String sPass = input.nextLine();
//
//                    boolean foundStudent = false;
//                    for (Student s : Student.students) {
//                        if (s.getUsername().equals(sUser) && s.getPassword().equals(sPass)) {
//                            System.out.println("Logged in as Student: " + s.getName());
//                            boolean studentSession = true;
//                            while (studentSession) {
//                                System.out.println("Student Menu:");
//                                System.out.println("1. View Enrolled Courses");
//                                System.out.println("2. View Available Modules");
//                                System.out.println("3. Enroll in Module");
//                                System.out.println("4. Cancel Enrollment");
//                                System.out.println("5. Logout");
//                                System.out.print("Choice: ");
//                                int studChoice = input.nextInt();
//                                input.nextLine();
//
//                                switch (studChoice) {
//                                    case 1:
//                                        s.viewCourses();
//                                        break;
//                                    case 2:
//                                        for (Module m : Module.modules) {
//                                            if (m.checkCapacity()) {
//                                                System.out.println(m);
//                                            }
//                                        }
//                                        break;
//                                    case 3:
//                                        System.out.print("Enter module ID to enroll: ");
//                                        int enrollID = input.nextInt();
//                                        input.nextLine();
//                                        s.enrollModule(enrollID);
//                                        break;
//                                    case 4:
//                                        System.out.print("Enter module ID to cancel: ");
//                                        int cancelID = input.nextInt();
//                                        input.nextLine();
//                                        s.cancelEnrollment(cancelID);
//                                        break;
//                                    case 5:
//                                        studentSession = false;
//                                        break;
//                                    default:
//                                        System.out.println("Invalid choice.");
//                                }
//                            }
//                            foundStudent = true;
//                            break;
//                        }
//                    }
//                    if (!foundStudent) System.out.println("Invalid student credentials.");
//                    break;
//
//                case 3:
//                    System.out.print("Enter Teacher username: ");
//                    String tUser = input.nextLine();
//                    System.out.print("Enter password: ");
//                    String tPass = input.nextLine();
//
//                    boolean foundTeacher = false;
//                    for (Teacher t : Teacher.teacher) {
//                        if (t.getUsername().equals(tUser) && t.getPassword().equals(tPass)) {
//                            System.out.println("Logged in as Teacher: " + t.getName());
//                            boolean teacherSession = true;
//                            while (teacherSession) {
//                                System.out.println("Teacher Menu:");
//                                System.out.println("1. View Assigned Modules");
//                                System.out.println("2. View Students in Module");
//                                System.out.println("3. Logout");
//                                System.out.print("Choice: ");
//                                int tChoice = input.nextInt();
//                                input.nextLine();
//
//                                switch (tChoice) {
//                                    case 1:
//                                        for (Module m : t.getAssignedModules()) {
//                                            System.out.println(m);
//                                        }
//                                        break;
//                                    case 2:
//                                        System.out.print("Enter Module ID to view students: ");
//                                        int mID = input.nextInt();
//                                        input.nextLine();
//                                        for (Module m : t.getAssignedModules()) {
//                                            if (m.getmoduleID() == mID) {
//                                                System.out.println("Students in " + m.getmoduleName() + ":");
//                                                for (Student s : m.getStudents()) {
//                                                    System.out.println("- " + s.getName() + " (ID: " + s.getID() + ")");
//                                                }
//                                            }
//                                        }
//                                        break;
//                                    case 3:
//                                        teacherSession = false;
//                                        break;
//                                    default:
//                                        System.out.println("Invalid choice.");
//                                }
//                            }
//                            foundTeacher = true;
//                            break;
//                        }
//                    }
//                    if (!foundTeacher) System.out.println("Invalid teacher credentials.");
//                    break;
//
//                case 4:
//                    System.out.println("Exiting system...");
//                    running = false;
//                    break;
//
//                default:
//                    System.out.println("Invalid input.");
//            }
//        }
//
//        input.close();
//    }
//}