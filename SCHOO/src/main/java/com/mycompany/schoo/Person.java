package com.mycompany.schoo;

import java.io.Serializable;

public abstract class Person implements Serializable{
    private String ID;
    private String name;
    private String email;
    private String username;
    private String password;

    public Person(String ID, String name, String email, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
    
    
    public void updateAccount(String username, String password) {
    this.setUsername(username);
    this.setPassword(password);
    System.out.println("Account updated.");
}


    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + name + ", Email: " + email;
    }
}
