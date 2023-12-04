package com.rdzienisz.university.repository;

import com.rdzienisz.university.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}