package com.preeti.spring_web.test_web.data;


public class LoginResponse {
    private String username;
    private String token;

    public LoginResponse(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername(){
        return username;
    }

    public String getToken() {
        return token;
    }
}
