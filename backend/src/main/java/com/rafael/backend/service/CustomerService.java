package com.rafael.backend.service;

import com.rafael.backend.dto.CustomerRequest;
import com.rafael.backend.dto.CustomerResponse;
import com.rafael.backend.model.Customer;
import com.rafael.backend.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public Customer register(CustomerRequest req) {
        return repo.save(new Customer(req.name(), req.email(), req.country()));
    }

    public Customer getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public List<CustomerResponse> getAllCustomers() {
        List<Customer> customers = repo.findAll();
        return customers.stream()
                .map(customer -> new CustomerResponse(
                        customer.getId(),
                        customer.getName(),
                        customer.getEmail(),
                        customer.getCountry()
                ))
                .collect(Collectors.toList());
    }
}

