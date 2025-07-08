package com.rafael.backend.service;

import com.rafael.backend.dto.DepositRequest;
import com.rafael.backend.model.Customer;
import com.rafael.backend.model.DepositTransaction;
import com.rafael.backend.repository.DepositRepository;
import org.springframework.stereotype.Service;

@Service
public class DepositService {
    private final DepositRepository repo;
    private final CustomerService customerService;

    public DepositService(DepositRepository repo, CustomerService customerService) {
        this.repo = repo;
        this.customerService = customerService;
    }

    public DepositTransaction deposit(DepositRequest req) {
        Customer customer = customerService.getById(req.customerId());
        return repo.save(new DepositTransaction(req.amount(), req.currency(), customer));
    }
}

