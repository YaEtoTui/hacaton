package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@RequiredArgsConstructor
@Getter
@Setter
public class Employee {
    @Column(name = "name")
    String name;
    @Column(name = "second_name")
    String secondName;
    @Column(name = "team")
    String team;
    @Column(name = "post")
    String post;
    @Column(name = "email")
    @Id
    String email;

}
