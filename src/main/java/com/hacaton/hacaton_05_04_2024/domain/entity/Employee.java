package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "employees")
@RequiredArgsConstructor
public class Employee {
    @Column(name = "Имя")
    String name;
    @Column(name = "Фамилия")
    String secondName;
    @Column(name = "Почта")
    @Id
    String email;
    @Column(name = "Должность")
    String dolchnost;
    @Column(name = "Команда")
    String team;
}
