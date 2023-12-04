package com.rdzienisz.university.entities;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double budget;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    @ManyToMany
    private List<Customer> customers;
}
