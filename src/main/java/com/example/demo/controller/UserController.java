package com.example.demo.controller;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userEntity));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> displayAllUsers()
    {
        return ResponseEntity.ok(userService.displayCustomer());
    }
}