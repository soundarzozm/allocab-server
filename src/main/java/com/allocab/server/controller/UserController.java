package com.allocab.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/")
    public String registerUser() {
        return "Hello, World!";
    }
}