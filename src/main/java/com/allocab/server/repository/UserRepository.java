package com.allocab.server.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.allocab.server.model.User;

@Repository
public class UserRepository extends JpaRepository<User, UUID> {

  public void save(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
}