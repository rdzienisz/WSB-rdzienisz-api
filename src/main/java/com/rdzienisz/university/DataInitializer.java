package com.rdzienisz.university;

import com.rdzienisz.university.entities.Company;
import com.rdzienisz.university.entities.Customer;
import com.rdzienisz.university.entities.Employee;
import com.rdzienisz.university.service.CompanyService;
import com.rdzienisz.university.service.CustomerService;
import com.rdzienisz.university.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder()
                .name("John Doe")
                .age(30)
                .position("Developer")
                .build();

        Employee employee2 = Employee.builder()
                .name("Jane Smith")
                .age(28)
                .position("Designer")
                .build();

        Employee employee3 = Employee.builder()
                .name("Bob Johnson")
                .age(35)
                .position("Manager")
                .build();

        Company company1 = Company.builder()
                .name("ABC Corp")
                .budget(100000.0)
                .build();

        Company company2 = Company.builder()
                .name("XYZ Ltd")
                .budget(80000.0)
                .build();

        Customer customer1 = Customer.builder()
                .name("Alice Johnson")
                .money(50000.0)
                .build();

        Customer customer2 = Customer.builder()
                .name("David White")
                .money(75000.0)
                .build();

        Customer customer3 = Customer.builder()
                .name("Eva Brown")
                .money(60000.0)
                .build();

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);

        companyService.addCompany(company1);
        companyService.addCompany(company2);

        customerService.addCustomer(customer1);
        customerService.addCustomer(customer2);
        customerService.addCustomer(customer3);
    }
}
