package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task")
@RequiredArgsConstructor
@Getter
@Setter
public class Task {

    @Column(name = "number")
    @Id
    Integer number;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "priority")
    String priority;
    @Column(name = "customer")
    String customer;
    @Column(name = "receiver")
    String receiver;
    @OneToOne()
    @JoinColumn(name = "project_id")
    Project project;
    @Column(name = "team")
    String team;
    @Column(name = "task_type")
    String taskType;
    @Column(name = "status")
    String status;
    @Column(name = "state")
    String state;
    @Column(name = "analyst")
    String analyst;
    @Column(name = "developer")
    String developer;
    @Column(name = "tester")
    String tester;
    @Column(name = "release_manager")
    String releaseManager;
    @Column(name = "analysis")
    Integer analysis;
    @Column(name = "development")
    Integer development;
    @Column(name = "testing")
    Integer testing;
    @Column(name = "release")
    String release;
    @Column(name = "data_create")
    String dataСreate;
    @Column(name = "zznumber")
    String zznumber;
    @Column(name = "block_task_number")
    String blockTaskNumber;
}
