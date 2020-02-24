package com.service;

import com.entities.Users;

import java.util.List;

public interface UserService {
    Users save(Users user);


    List<Users> findAll();

    Users getUserByEmail(String email);
}
