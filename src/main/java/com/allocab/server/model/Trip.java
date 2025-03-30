package com.allocab.server.model;

import java.time.LocalDate;
import java.util.UUID;

import com.allocab.server.util.Enums.TripStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trips")
public class Trip {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  UUID trip_id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false) // Foreign key column
  private User user_id;

  LocalDate trip_date;
  boolean is_additional;

  @Enumerated(EnumType.STRING)
  TripStatus trip_status;

  public Trip(User user_id, LocalDate trip_date, boolean is_additional, TripStatus trip_status) {
    this.user_id = user_id;
    this.trip_date = trip_date;
    this.is_additional = is_additional;
    this.trip_status = trip_status;
  }

  public UUID getTripId() {
    return trip_id;
  }

  public User getUserId() {
    return user_id;
  }

  public LocalDate getTripDate() {
    return trip_date;
  }

  public boolean getIsAdditional() {
    return is_additional;
  }

  public TripStatus getTripStatus() {
    return trip_status;
  }

  public void setTripId(UUID trip_id) {
    this.trip_id = trip_id;
  }

  public void setUserId(User user_id) {
    this.user_id = user_id;
  }

  public void setTripDate(LocalDate trip_date) {
    this.trip_date = trip_date;
  }

  public void setIsAdditional(boolean is_additional) {
    this.is_additional = is_additional;
  }

  public void setTripStatus(TripStatus trip_status) {
    this.trip_status = trip_status;
  }
}
