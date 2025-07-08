package com.rafael.backend.controller;

import com.rafael.backend.dto.*;
import com.rafael.backend.service.AccountService;
import com.rafael.backend.service.CustomerService;
import com.rafael.backend.service.DepositService;
import com.rafael.backend.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkflowController {

    private final CustomerService customerService;
    private final AccountService accountService;
    private final DepositService depositService;
    private final PaymentService paymentService;

    public WorkflowController(
            CustomerService customerService,
            AccountService accountService,
            DepositService depositService,
            PaymentService paymentService
    ) {
        this.customerService = customerService;
        this.accountService = accountService;
        this.depositService = depositService;
        this.paymentService = paymentService;
    }

    @PostMapping("/customers/register")
    public ResponseEntity<?> register(@RequestBody CustomerRequest request) {
        return ResponseEntity.ok(customerService.register(request));
    }

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        List<CustomerResponse> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    @PostMapping("/accounts/open")
    public ResponseEntity<?> openAccount(@RequestBody AccountRequest request) {
        return ResponseEntity.ok(accountService.openAccount(request));
    }

    @PostMapping("/transactions/deposit")
    public ResponseEntity<?> deposit(@RequestBody DepositRequest request) {
        return ResponseEntity.ok(depositService.deposit(request));
    }

    @PostMapping("/payments/create")
    public ResponseEntity<?> createPayment(@RequestBody PaymentRequest request) {
        return ResponseEntity.ok(paymentService.create(request));
    }
}

