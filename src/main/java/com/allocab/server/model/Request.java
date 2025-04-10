package com.allocab.server.model;

import java.time.LocalDate;
import java.util.UUID;

import com.allocab.server.util.Enums.RequestStatus;
import com.allocab.server.util.Enums.RequestType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "requests")
public class Request {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  UUID request_id;

  @Column(name = "user_id", nullable = false)
  UUID user_id;

  LocalDate requested_for;
  LocalDate requested_on;

  @Enumerated(EnumType.STRING)
  RequestType request_type;

  @Enumerated(EnumType.STRING)
  RequestStatus request_status;

  // Add a no-argument constructor (required by Hibernate)
  public Request() {
  }

  public Request(UUID user_id, LocalDate requested_for, LocalDate requested_on, RequestType request_type, RequestStatus request_status) {
    this.user_id = user_id;
    this.requested_for = requested_for;
    this.requested_on = requested_on;
    this.request_type = request_type;
    this.request_status = request_status;
  }

  public UUID getRequestId() {
    return request_id;
  }

  public UUID getUserId() {
    return user_id;
  }

  public LocalDate getRequestedFor() {
    return requested_for;
  }

  public LocalDate getRequestedOn() {
    return requested_on;
  }

  public RequestType getRequestType() {
    return request_type;
  }

  public RequestStatus getRequestStatus() {
    return request_status;
  }

  public void setRequestId(UUID request_id) {
    this.request_id = request_id;
  }

  public void setUserId(UUID user_id) {
    this.user_id = user_id;
  }

  public void setRequestedFor(LocalDate requested_for) {
    this.requested_for = requested_for;
  }

  public void setRequestedOn(LocalDate requested_on) {
    this.requested_on = requested_on;
  }

  public void setRequestType(RequestType request_type) {
    this.request_type = request_type;
  }

  public void setRequestStatus(RequestStatus request_status) {
    this.request_status = request_status;
  }
}