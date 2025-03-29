package com.allocab.server.repository;

import java.util.UUID;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.allocab.server.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {
}