package com.rafael.backend.dto;

public record DepositRequest(Long customerId, Double amount, String currency) {}
