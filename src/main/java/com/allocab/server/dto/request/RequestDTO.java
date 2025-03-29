package com.allocab.server.dto.request;

import java.time.LocalDate;
import java.util.UUID;

import com.allocab.server.util.Enums.RequestType;
import com.fasterxml.jackson.annotation.JsonFormat;

public class RequestDTO {
    private UUID userId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate requestedOn;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate requestedFor;
    private RequestType requestType;

    // Constructors (default and parameterized)
    public RequestDTO() {}

    public RequestDTO(UUID userId, LocalDate requestedOn, LocalDate requestedFor, RequestType requestType) {
        this.userId = userId;
        this.requestedOn = requestedOn;
        this.requestedFor = requestedFor;
        this.requestType = requestType;
    }

    // Getters and setters
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public LocalDate getRequestedOn() {
        return requestedOn;
    }

    public void setRequestedOn(LocalDate requestedOn) {
        this.requestedOn = requestedOn;
    }

    public LocalDate getRequestedFor() {
        return requestedFor;
    }

    public void setRequestedFor(LocalDate requestedFor) {
        this.requestedFor = requestedFor;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}
