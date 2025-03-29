package com.allocab.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String test() {
        return "Hello, World!";
    }

    @PostMapping("/")
    public String registerUser() {
        return "Hello, World!";
    }
}