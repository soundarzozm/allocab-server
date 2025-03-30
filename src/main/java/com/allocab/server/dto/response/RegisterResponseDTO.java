package com.allocab.server.dto.response;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterResponseDTO {
  private UUID userId;
  private String message;

  public RegisterResponseDTO() {
    // Default constructor for serialization/deserialization
  }

  public RegisterResponseDTO(String message) {
    this.message = message;
  }

  public RegisterResponseDTO(UUID userId, String message) {
    this.message = message;
    this.userId = userId;
  }

  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
}
