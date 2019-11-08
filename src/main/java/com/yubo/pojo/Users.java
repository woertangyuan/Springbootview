package com.yubo.pojo;

public class Users {
    private int uid;
    private String username;
    private String password;
    private String password_salt;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getPassword_salt() {
        return password_salt;
    }

    public void setPassword_salt(String password_salt) {
        this.password_salt = password_salt;
    }

    public Users() {
    }

    public Users(int uid, String username, String password, String password_salt) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.password_salt = password_salt;
    }
}
