package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "project")
@RequiredArgsConstructor
public class Project {
    @Id
    String name;
    String description;
    String datestart;
    String dateend;
    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY)
    Task task;
}
