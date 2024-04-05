package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "projects")
@RequiredArgsConstructor
public class Project {
    @Id
    @Column(name = "Наименованме")
    String name;
    @Column(name = "Описание")
    String description;
    @Column(name = "Плановая дата начала")
    String dateStart;
    @Column(name = "Плановая дата завершения")
    String dateEnd;
}
