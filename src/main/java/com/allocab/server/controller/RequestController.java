package com.allocab.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.allocab.server.model.Request;
import com.allocab.server.service.RequestService;

@RestController
public class RequestController {
  private final RequestService requestService;

  @Autowired
  public RequestController(RequestService requestService) {
    this.requestService = requestService;
  }

  @GetMapping("/requests")
  public List<Request> getRequests() {
    return requestService.getRequests();
  }

  @PostMapping("/requests")
  public void createRequest(@RequestBody Request request) {
    requestService.createRequest(request);
  }
}
