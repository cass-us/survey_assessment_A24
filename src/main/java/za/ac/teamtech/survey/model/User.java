/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.teamtech.survey.model;

import java.util.Objects;

/**
 *
 * @author RONALD
 */
public class User {
    private String full_names;
    private String email;
    private String date_of_birth;
    private String contact;
    private int age;
//  ull_names,email,date_of_birth,contact,age
    public User(String full_names, String email, String date_of_birth, String contact, int age) {
        this.full_names = full_names;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.contact = contact;
        this.age = age;
    }
    
      public User(String full_names, String email, String date_of_birth, String contact) {
        this.full_names = full_names;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.contact = contact;
        
    }
    
    public User(){}

    /**
     * @return the full_names
     */
    public String getFull_names() {
        return full_names;
    }

    /**
     * @param full_names the full_names to set
     */
    public void setFull_names(String full_names) {
        this.full_names = full_names;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the date_of_birth
     */
    public String getDate_of_birth() {
        return date_of_birth;
    }

    /**
     * @param date_of_birth the date_of_birth to set
     */
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.full_names);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.date_of_birth);
        hash = 67 * hash + Objects.hashCode(this.contact);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.full_names, other.full_names)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.date_of_birth, other.date_of_birth)) {
            return false;
        }
        return Objects.equals(this.contact, other.contact);
    }

    @Override
    public String toString() {
        return "User{" + "full_names=" + full_names + ", email=" + email + ", date_of_birth=" + date_of_birth + ", contact=" + contact + '}';
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
}
