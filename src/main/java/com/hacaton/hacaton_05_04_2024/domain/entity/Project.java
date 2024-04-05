package com.hacaton.hacaton_05_04_2024.domain.entity;

import com.hacaton.hacaton_05_04_2024.domain.context.ContextProject;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "project")
@RequiredArgsConstructor
public class Project {
    @Column(name = "Наименование")
    @Id
    String name;
    @Column(name = "Описание")
    String description;
    @Column(name = "Плановая дата начала")
    String dateStart;
    @Column(name = "Плановая дата завершения")
    String dateEnd;
    @OneToOne(mappedBy = "project", fetch = FetchType.LAZY)
    Task task;

    public Project(ContextProject contextProject) {
        name = contextProject.getName();
        description = contextProject.getDescription();
        dateStart = contextProject.getDatestart();
        dateEnd = contextProject.getDateend();
    }
}
