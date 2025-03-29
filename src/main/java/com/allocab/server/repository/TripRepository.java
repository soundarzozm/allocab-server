package com.allocab.server.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;

import com.allocab.server.model.Trip;

@Repository
public class TripRepository extends JpaRepository<Trip, UUID> {

  public void save(Trip trip) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'save'");
  }
}