package com.example.feedbackapp.model;

public class Trainee {
    String UserName;
    String Name;
    String Email;
    String Phone;
    String Address;
    boolean IsActive;
    String Password;
    String ActivationCode;
    String ResetPasswordCode;

    public Trainee(String userName, String name, String email, String phone, String address, boolean isActive, String password, String activationCode, String resetPasswordCode) {
        UserName = userName;
        Name = name;
        Email = email;
        Phone = phone;
        Address = address;
        IsActive = isActive;
        Password = password;
        ActivationCode = activationCode;
        ResetPasswordCode = resetPasswordCode;
    }

    public Trainee(String userName, String name ) {
        Name = name;
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getActivationCode() {
        return ActivationCode;
    }

    public void setActivationCode(String activationCode) {
        ActivationCode = activationCode;
    }

    public String getResetPasswordCode() {
        return ResetPasswordCode;
    }

    public void setResetPasswordCode(String resetPasswordCode) {
        ResetPasswordCode = resetPasswordCode;
    }
}
