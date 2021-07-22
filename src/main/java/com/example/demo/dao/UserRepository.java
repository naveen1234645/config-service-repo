package com.example.demo.dao;

import com.example.demo.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<UserEntity,String> {
}