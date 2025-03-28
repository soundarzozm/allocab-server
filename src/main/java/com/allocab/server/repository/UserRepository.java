package com.allocab.server.repository;

import org.springframework.stereotype.Repository;
import com.allocab.server.model.User;

@Repository
public class UserRepository extends JpaRepository<User, Integer> {

  public void save(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
}