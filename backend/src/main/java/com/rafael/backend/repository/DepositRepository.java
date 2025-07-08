package com.rafael.backend.repository;

import com.rafael.backend.model.DepositTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<DepositTransaction, Long> {
}
