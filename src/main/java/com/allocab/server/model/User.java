package com.allocab.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  UUID id;

  enum Role {
    USER,
    ADMIN
  }

  String first_name;
  String last_name;
  String email;
  String password;

  @Enumerated(EnumType.STRING)
  Role role;
  String address;
  boolean[] days_opted;

  public User(
      String first_name,
      String last_name,
      String email,
      String password,
      Role role,
      String address,
      boolean[] days_opted) {
    this.address = address;
    this.days_opted = days_opted;
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.password = password;
    this.role = role;
  }

  public UUID getId() {
    return id;
  }

  public String getAddress() {
    return address;
  }

  public boolean[] getDays_opted() {
    return days_opted;
  }

  public String getEmail() {
    return email;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getPassword() {
    return password;
  }

  public Role getRole() {
    return role;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setDays_opted(boolean[] days_opted) {
    this.days_opted = days_opted;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
