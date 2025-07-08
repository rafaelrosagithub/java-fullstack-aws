package com.rafael.backend.service;

import com.rafael.backend.dto.AccountRequest;
import com.rafael.backend.model.Account;
import com.rafael.backend.model.Customer;
import com.rafael.backend.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository repo;
    private final CustomerService customerService;

    public AccountService(AccountRepository repo, CustomerService customerService) {
        this.repo = repo;
        this.customerService = customerService;
    }

    public Account openAccount(AccountRequest req) {
        Customer customer = customerService.getById(req.customerId());
        return repo.save(new Account(req.currency(), customer));
    }
}

