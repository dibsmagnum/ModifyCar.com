package com.assignment.carClass;

import org.springframework.stereotype.Component;

@Component
public class LoginPage {
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    private String userName;
    private int password; 
}
