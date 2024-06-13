package com.example.demo.model;
//import javax.persistence.Entity;
//
//@Entity
public class User { long id; String name; String designation; public User(long id, String name, String designation){ this.id = id; this.name = name; this.designation = designation; }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", designation='" + designation + '\'' + '}'; }
}