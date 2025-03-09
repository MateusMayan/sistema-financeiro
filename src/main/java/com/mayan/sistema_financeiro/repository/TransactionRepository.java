package com.mayan.sistema_financeiro.repository;

import com.mayan.sistema_financeiro.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
