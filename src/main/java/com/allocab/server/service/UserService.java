package com.allocab.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.repository.UserRepository;

@Service
public class UserService {
  UserRepository userRepository;
  
    @Autowired
    public UserService(UserRepository userRepository) {
      this.userRepository = userRepository;
  }
}
