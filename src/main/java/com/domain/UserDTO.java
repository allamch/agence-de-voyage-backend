package com.domain;

import com.entities.Users;

import java.io.Serializable;


public class UserDTO implements Serializable {

    private Users user;
    private String token;

    public UserDTO(Users user, String token) {
        this.user = user;
        this.token = token;
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
}


