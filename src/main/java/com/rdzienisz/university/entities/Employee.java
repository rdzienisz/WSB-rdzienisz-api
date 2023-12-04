package com.rdzienisz.university.entities;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String position;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
