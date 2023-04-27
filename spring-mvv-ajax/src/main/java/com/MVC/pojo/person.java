package com.MVC.pojo;

public class person {
    private String username;
    private String password;
    public person(){}
    public person(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
