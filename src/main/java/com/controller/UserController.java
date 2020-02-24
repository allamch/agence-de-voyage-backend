package com.controller;

import com.entities.Users;
import com.repository.UserRepository;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {
    @Autowired private UserService userService;
    @GetMapping(value="/users")
    public ResponseEntity<List<Users>> getAllusers(){
       List<Users> users= userService.findAll();
return  new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }
    @GetMapping(value="/getuser")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Users> getUser(Principal principal){

       Users users= userService.getUserByEmail(principal.getName());
        return  new ResponseEntity<Users>(users, HttpStatus.OK);
    }
}
