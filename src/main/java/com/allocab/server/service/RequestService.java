package com.allocab.server.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allocab.server.model.Request;
import com.allocab.server.repository.RequestRepository;
import com.allocab.server.util.Enums.RequestStatus;
import com.allocab.server.util.Enums.RequestType;

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

  public void createRequest(UUID userId, LocalDate requestedOn, LocalDate requestedFor, RequestType requestType) {
    Optional<Request> existingRequest = requestRepository.findByDateAndUserId(requestedFor, userId);
    if (existingRequest.isPresent()) {
      System.out.println("Request already exists for this date and user.");
    } else {
      Request request = new Request(userId, requestedFor, requestedOn, requestType, RequestStatus.PENDING);
      requestRepository.save(request);
    }
  }
}
