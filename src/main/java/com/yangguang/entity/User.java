package com.yangguang.entity;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer validity;

    public User(){

    }
    public User(Integer userId, String userName, String userPassword, Integer validity) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.validity = validity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", validity=" + validity +
                '}';
    }
}