package com.allocab.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.model.User;
import com.allocab.server.repository.UserRepository;

@Service
public class UserService {
  UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void registerUser(User user) {
    Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
    System.out.println("Existing user: " + existingUser);
    if (existingUser.isPresent()) {
      throw new IllegalArgumentException("User with this email already exists");
    } 
    userRepository.save(user);
  }
}
