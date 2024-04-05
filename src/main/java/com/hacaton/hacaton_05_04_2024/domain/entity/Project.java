package com.hacaton.hacaton_05_04_2024.domain.entity;

import com.hacaton.hacaton_05_04_2024.domain.context.ContextProject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@RequiredArgsConstructor
@Getter
@Setter
public class Project {
    @Column(name = "name")
    @Id
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "date_start")
    String dateStart;
    @Column(name = "date_end")
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
