package com.hacaton.hacaton_05_04_2024.domain.entity;

import com.hacaton.hacaton_05_04_2024.domain.context.ContextProject;
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

    public Project(ContextProject contextProject) {
        name = contextProject.getName();
        description = contextProject.getDescription();
        datestart = contextProject.getDatestart();
        dateend = contextProject.getDateend();
    }
}
