package com.rdzienisz.university.repository;

import com.rdzienisz.university.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
