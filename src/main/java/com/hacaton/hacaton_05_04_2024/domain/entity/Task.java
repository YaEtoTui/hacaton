package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "task")
@RequiredArgsConstructor
public class Task {

    @Id
    Integer number;
    String zagolovok;
    String desccription;
    String prioritet;
    String zakaschik;
    String priemchik;
    @OneToOne()
    @JoinColumn(name = "project_id")
    Project project;
    String team;
    String typetask;
    String status;
    String sostoanie;
    String analitik;
    String developer;
    String testirovchik;
    String relismanager;
    Integer spanalis;
    Integer spdeveloper;
    Integer sptestirovanie;
    String sprelis;
    String datacreate;
    String zznumber;
    String blocktasknumber;
}
