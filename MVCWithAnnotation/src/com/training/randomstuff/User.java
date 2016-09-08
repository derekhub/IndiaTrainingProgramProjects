package com.training.randomstuff;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String userName;
    private String passWord;
    private int phoneNumber;

    public User() {
        super();
    }

    public User(String userName, String passWord, int phoneNumber) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
