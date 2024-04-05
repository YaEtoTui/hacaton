package com.hacaton.hacaton_05_04_2024.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "tasks")
@RequiredArgsConstructor
public class Tasks {

    @Column(name = "Номер")
    @Id
    Integer number;
    @Column(name = "Заголовок")
    String zagolovok;
    @Column(name = "Описание")
    String desccription;
    @Column(name = "Приоритет")
    String prioritet;
    @Column(name = "Заказчик")
    String zakaschik;
    @Column(name = "Приёмщик")

    String priemchik;
    @Column(name = "Проект")

    String project;
    @Column(name = "Команда")
    String team;
    @Column(name = "Тип задачи")
    String typeTask;
    @Column(name = "Статус")
    String status;
    @Column(name = "Состояние")
    String sostoanie;
    @Column(name = "Аналитик")
    String analitik;
    @Column(name = "Разработчик")
    String developer;
    @Column(name = "Тестировщик")
    String testirovchik;
    @Column(name = "Релиз менеджер")
    String relisManager;
    @Column(name = "SP анализ")
    Integer SpAnalis;
    @Column(name = "SP разработка")
    Integer SpDeveloper;
    @Column(name = "SP тестирование")
    Integer SpTestirovanie;
    @Column(name = "SP релиз")
    String SpRelis;
    @Column(name = "Дата создания")
    String dataCreate;
    @Column(name = "Заблокирована задачей с номером")
    String ZZNumber;
    @Column(name = "Блокирует задачу с номером")
    String blockTaskNumber;
}
