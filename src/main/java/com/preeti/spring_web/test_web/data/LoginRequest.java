package com.preeti.spring_web.test_web.data;

public class LoginRequest {
    private String username;
    private String password;

    LoginRequest() {
    }
    LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
