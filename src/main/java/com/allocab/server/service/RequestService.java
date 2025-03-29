package com.allocab.server.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.model.Request;
import com.allocab.server.model.User;
import com.allocab.server.repository.RequestRepository;

@Service
public class RequestService {
  final RequestRepository requestRepository;

  @Autowired
  public RequestService(RequestRepository requestRepository) {
    this.requestRepository = requestRepository;
  }

  public List<Request> getRequests() {
    return requestRepository.findAll();
  }

  public void createRequest(Request request) {
    User currentUser = request.getUserId();

    Optional<Request> existingRequest = requestRepository.findByDateAndUserId(request.getRequestedFor(), currentUser);
    System.out.println("Existing request: " + existingRequest);
  }
}
