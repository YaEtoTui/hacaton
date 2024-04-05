package com.hacaton.hacaton_05_04_2024.service.factory;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;
import com.hacaton.hacaton_05_04_2024.domain.entity.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskFactory {

    public List<TaskResponse> createListTaskResponse(List<Task> taskList) {
        return taskList.stream()
                .map(this::createTaskResponse)
                .collect(Collectors.toList());
    }

    private TaskResponse createTaskResponse(Task task) {
        return new TaskResponse(
                task.getNumber(),
                task.getTitle(),
                task.getDescription(),
                task.getPriority(),
                task.getCustomer(),
                task.getReceiver(),
                task.getProject().getName(),
                task.getTeam(),
                task.getTaskType(),
                task.getStatus(),
                task.getState(),
                task.getAnalyst(),
                task.getDeveloper(),
                task.getTester(),
                task.getReleaseManager(),
                task.getAnalysis(),
                task.getDevelopment(),
                task.getTesting(),
                task.getRelease(),
                task.getDataСreate(),
                task.getZznumber(),
                task.getBlockTaskNumber()
        );
    }
}
