package com.allocab.server.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.allocab.server.model.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, UUID> {
}