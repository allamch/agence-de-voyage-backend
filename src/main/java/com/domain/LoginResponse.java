package com.domain;

import com.entities.Users;

import org.springframework.stereotype.Component;

@Component
public class LoginResponse{
    private String token;
    private Users user;

    public LoginResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public LoginResponse(String token, Users user) {
        this.token = token;
        this.user = user;
    }
}
