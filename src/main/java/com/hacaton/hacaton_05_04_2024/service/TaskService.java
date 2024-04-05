package com.hacaton.hacaton_05_04_2024.service;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;

import java.util.List;

public interface TaskService {
    List<TaskResponse> showListTasks();
}
