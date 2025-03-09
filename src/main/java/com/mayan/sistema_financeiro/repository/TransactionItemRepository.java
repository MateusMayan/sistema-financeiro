package com.mayan.sistema_financeiro.repository;

import com.mayan.sistema_financeiro.model.TransactionItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionItemRepository extends JpaRepository<TransactionItem,Integer> {
}
