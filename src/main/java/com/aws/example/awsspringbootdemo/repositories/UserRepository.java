package com.aws.example.awsspringbootdemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aws.example.awsspringbootdemo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
