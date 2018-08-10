package com.snb.model;
public class BasicInfo {
private int id;
private String name,email,mobile_no,gender,user,password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.email + ", " + this.gender + ", " + this.mobile_no + ", " + this.name + ", " + this.password; //To change body of generated methods, choose Tools | Templates.
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

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BasicInfo(int id, String name, String email, String mobile_no, String gender, String user, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.gender = gender;
        this.user = user;
        this.password = password;
    }
    public BasicInfo(){

    
    }
}