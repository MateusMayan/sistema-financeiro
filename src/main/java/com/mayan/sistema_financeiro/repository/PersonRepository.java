package com.mayan.sistema_financeiro.repository;

import com.mayan.sistema_financeiro.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
