package com.example.librarybackendspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Userregisteration")
public class Userregisteration {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String aadhar;
    private String address;
    private String pin;
    private String dob;
    private String email;
    private String phoneno;
    private String username;
    private String password;
    private String confirmpass;

    public Userregisteration() {
    }

    public Userregisteration(int id, String name, String aadhar, String address, String pin, String dob, String email, String phoneno, String username, String password, String confirmpass) {
        this.id = id;
        this.name = name;
        this.aadhar = aadhar;
        this.address = address;
        this.pin = pin;
        this.dob = dob;
        this.email = email;
        this.phoneno = phoneno;
        this.username = username;
        this.password = password;
        this.confirmpass = confirmpass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
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

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }
}
