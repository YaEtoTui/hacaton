package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "employee")
@RequiredArgsConstructor
public class Employee {
    @Id
    String email;
    String name;
    String secondname;
    String dolchnost;
    String team;
}
