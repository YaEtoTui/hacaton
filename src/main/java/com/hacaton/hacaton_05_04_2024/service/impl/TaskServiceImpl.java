package com.hacaton.hacaton_05_04_2024.service.impl;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;
import com.hacaton.hacaton_05_04_2024.repository.TaskRepository;
import com.hacaton.hacaton_05_04_2024.service.TaskService;
import com.hacaton.hacaton_05_04_2024.service.factory.TaskFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;
    TaskFactory taskFactory;


    @Override
    public List<TaskResponse> showListTasks() {
        return taskFactory.createListTaskResponse(taskRepository.findAll());
    }
}
