package com.allocab.server.repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.allocab.server.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {

  @Query("SELECT r FROM Request r WHERE r.requested_for = ?1 AND r.user_id = ?2")
  Optional<Request> findByDateAndUserId(LocalDate requested_for, UUID user_id);
}