package com.allocab.server.dto.request;

public class RegisterRequestDTO {
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String address;
  private boolean[] daysOpted;

  public RegisterRequestDTO() {
  }

  public RegisterRequestDTO(
      String firstName,
      String lastName,
      String email,
      String password,
      String address,
      boolean[] daysOpted) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.address = address;
    this.daysOpted = daysOpted;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getAddress() {
    return address;
  }

  public boolean[] getDaysOpted() {
    return daysOpted;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setDaysOpted(boolean[] daysOpted) {
    this.daysOpted = daysOpted;
  }
}
