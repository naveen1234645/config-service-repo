package com.example.demo.service;

import com.example.demo.model.UserEntity;

import java.util.List;

public interface UserService {

    public UserEntity createUser(UserEntity userEntity);
    public List<UserEntity> displayCustomer();
}