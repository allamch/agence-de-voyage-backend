package com.controller;

import com.entities.Jardin;
import com.entities.Users;
import com.repository.UserRepository;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 9/4/2019.
 */
@RestController
public class UsersController {
    @Autowired
    private UserRepository userDao;

    @Autowired private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Users> CreateUser(@RequestBody Users user){

          userDao.save(user);
          Users u = userDao.findById(user.getId()).get();
          return new ResponseEntity<>(u, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ResponseEntity<Users> EditUser(@RequestBody Users user){


            userDao.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<Iterable<Users>> DeleteUser(@RequestParam(name = "id") Long id){
        userDao.deleteById(id);
        return new ResponseEntity<>(userDao.findAll(), HttpStatus.OK);
    }

}
