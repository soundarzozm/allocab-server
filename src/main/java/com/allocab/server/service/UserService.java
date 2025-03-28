package com.allocab.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.model.User;
import com.allocab.server.repository.UserRepository;

@Service
public class UserService {
  private UserRepository userRepository;
  
    @Autowired
    public UserService(UserRepository userRepository) {
      this.userRepository = userRepository;
  }

  public void addUser(
    String first_name,
      String last_name,
      String email,
      String password,
      Enum<Role> role,
      String address,
      boolean[] days_opted
  ) {
    User user = new User(first_name, last_name, email, password, role, address, days_opted);
    userRepository.save(user);
  }
}
