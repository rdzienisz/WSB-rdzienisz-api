package com.rdzienisz.university.repository;

import com.rdzienisz.university.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
