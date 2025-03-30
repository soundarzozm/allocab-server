package com.allocab.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.model.User;
import com.allocab.server.repository.UserRepository;
import com.allocab.server.util.Enums.Role;

@Service
public class UserService {
  UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void registerUser(String firstName, String lastName, String email, String password, String address, boolean[] daysOpted) {
    Optional<User> existingUser = userRepository.findByEmail(email);
    System.out.println("Existing user: " + existingUser);
    if (existingUser.isPresent()) {
      throw new IllegalArgumentException("User with this email already exists");
    }
    User user = new User(firstName, lastName, email, password, Role.USER, address, daysOpted);
    userRepository.save(user);
  }
}
