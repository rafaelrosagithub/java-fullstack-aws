package com.rafael.backend.service;

import com.rafael.backend.dto.PaymentRequest;
import com.rafael.backend.model.Customer;
import com.rafael.backend.model.PaymentInstruction;
import com.rafael.backend.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository repo;
    private final CustomerService customerService;

    public PaymentService(PaymentRepository repo, CustomerService customerService) {
        this.repo = repo;
        this.customerService = customerService;
    }

    public PaymentInstruction create(PaymentRequest req) {
        Customer customer = customerService.getById(req.customerId());
        return repo.save(new PaymentInstruction(
                null, req.solanceFrom(), req.solanceTo(), req.amountSell(), req.amountBuy(),
                req.rate(), req.timePlaced(), req.beneficiaryIban(), req.originatingCountry(),
                req.paymentRef(), req.purposeRef(), customer
        ));
    }
}
