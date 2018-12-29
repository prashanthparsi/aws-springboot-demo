package com.aws.example.awsspringbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.example.awsspringbootdemo.entities.User;
import com.aws.example.awsspringbootdemo.repositories.UserRepository;

@RestController
@RequestMapping(path = "/user")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello User";
    }

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
                                            ,@RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
