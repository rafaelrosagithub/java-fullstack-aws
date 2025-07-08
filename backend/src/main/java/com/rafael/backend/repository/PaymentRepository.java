package com.rafael.backend.repository;

import com.rafael.backend.model.PaymentInstruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentInstruction, Long> {
}
