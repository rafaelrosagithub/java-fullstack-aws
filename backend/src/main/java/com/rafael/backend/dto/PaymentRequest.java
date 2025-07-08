package com.rafael.backend.dto;

public record PaymentRequest(
        Long customerId,
        String solanceFrom,
        String solanceTo,
        Double amountSell,
        Double amountBuy,
        Double rate,
        String timePlaced,
        String beneficiaryIban,
        String originatingCountry,
        String paymentRef,
        String purposeRef
) {}
