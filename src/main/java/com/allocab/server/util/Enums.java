package com.allocab.server.util;

public class Enums {
  public enum Role {
    USER,
    ADMIN
  }

  public enum TripStatus {
    TAKEN,
    CANCELLED,
    NOT_BOARDED
  }

  public enum RequestType {
    ADDITIONAL,
    CANCELLATION
  }

  public enum RequestStatus {
    PENDING,
    APPROVED,
    REJECTED
  }
}
