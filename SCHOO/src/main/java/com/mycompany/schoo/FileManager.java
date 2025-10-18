package com.mycompany.schoo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
import static com.mycompany.schoo.Module.modules;
import static com.mycompany.schoo.Student.students;
import static com.mycompany.schoo.Teacher.teacher;




public class FileManager {

  public static void saveStudents(String filename, List<Student> students) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
        for (Student s : students) {
            writer.write(s.getID() + "," +s.getName() + "," +s.getEmail() + "," +s.getUsername() + "," +s.getPassword() + "," +s.getDateOfBirth() + "," +s.getGender());
            writer.newLine();
        }
        System.out.println("Students saved successfully to " + filename);
    } catch (IOException e) {
        System.out.println("Error saving students: " + e.getMessage());
    }
}

 public static List<Student> loadStudents(String filename) {
    List<Student> loadedStudents = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.trim().split(",");
            if (parts.length == 7) {
                String id = parts[0];
                String name = parts[1];
                String email = parts[2];
                String username = parts[3];
                String password = parts[4];
                String dob = parts[5];
                String gender = parts[6];

                boolean exists = false;
                for (Student s : loadedStudents) {
                    if (s.getID().equals(id) ||
                        s.getEmail().equalsIgnoreCase(email) ||
                        s.getUsername().equalsIgnoreCase(username)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    loadedStudents.add(new Student(id, name, email, username, password, dob, gender));
                }
            } else {
                System.out.println("Skipping invalid student line: " + line);
            }
        }

        Student.students = loadedStudents;
        System.out.println("Students loaded from text: " + Student.students.size());
    } catch (IOException e) {
        System.out.println("Error loading students: " + e.getMessage());
    }

    return loadedStudents;
}


    public static void saveTeachers(String filename, List<Teacher> teachers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(teachers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Teacher> loadTeachers(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Teacher> loaded = (List<Teacher>) ois.readObject();
            teacher = loaded;
            return loaded;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void saveModules(String filename, List<Module> modules) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(modules);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Module> loadModules(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Module> loaded = (List<Module>) ois.readObject();
            modules = loaded;
            return loaded;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
} 
