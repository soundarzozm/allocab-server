package com.allocab.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.allocab.server.dto.request.RegisterDTO;
import com.allocab.server.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String test() {
        return "Hello, World!";
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody RegisterDTO user) {
        userService.registerUser(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getAddress(),
                user.getDaysOpted());
        return ResponseEntity.ok().build();
    }
}