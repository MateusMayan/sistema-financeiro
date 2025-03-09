package com.mayan.sistema_financeiro.repository;

import com.mayan.sistema_financeiro.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
