package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "task")
@RequiredArgsConstructor
public class Task {

    @Column(name = "Номер")
    @Id
    Integer number;
    @Column(name = "Заголовок")
    String title;
    @Column(name = "Описание")
    String description;
    @Column(name = "Приоритет")
    String priority;
    @Column(name = "Заказчик")
    String customer;
    @Column(name = "Приёмщик")
    String receiver;
    @OneToOne()
    @JoinColumn(name = "project_id")
    Project project;
    @Column(name = "Команда")
    String team;
    @Column(name = "Тип задачи")
    String taskType;
    @Column(name = "Статус")
    String status;
    @Column(name = "Состояние")
    String state;
    @Column(name = "Аналитик")
    String analyst;
    @Column(name = "Разработчик")
    String developer;
    @Column(name = "Тестировщик")
    String tester;
    @Column(name = "Релиз менеджер")
    String releaseManager;
    @Column(name = "SP анализ")
    Integer analysis;
    @Column(name = "SP разработка")
    Integer development;
    @Column(name = "SP тестирование")
    Integer testing;
    @Column(name = "SP релиз")
    String release;
    @Column(name = "Дата создания")
    String dataСreate;
    @Column(name = "Заблокирована задачей с номером")
    String zznumber;
    @Column(name = "Блокирует задачу с номером")
    String blockTaskNumber;
}
