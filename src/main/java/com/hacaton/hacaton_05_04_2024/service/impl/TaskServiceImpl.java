package com.hacaton.hacaton_05_04_2024.service.impl;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;
import com.hacaton.hacaton_05_04_2024.domain.entity.Task;
import com.hacaton.hacaton_05_04_2024.repository.TaskRepository;
import com.hacaton.hacaton_05_04_2024.service.TaskService;
import com.hacaton.hacaton_05_04_2024.service.factory.TaskFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @Override
    public List<TaskResponse> showListPriority() {
        List<Task> taskList = taskRepository.findAll();
        List<Task> listPriorityHighError = taskList.stream().filter(task -> task.getPriority().equals("Высокий") && task.getTaskType().equals("Ошибка")).toList();
        List<Task> listPriorityHighFunc = taskList.stream().filter(task -> task.getPriority().equals("Высокий") && task.getTaskType().equals("Новая функциональность")).toList();
        List<Task> listPriorityMiddleError = taskList.stream().filter(task -> task.getPriority().equals("Средний") && task.getTaskType().equals("Ошибка")).toList();
        List<Task> listPriorityMiddleFunc = taskList.stream().filter(task -> task.getPriority().equals("Средний") && task.getTaskType().equals("Новая функциональность")).toList();
        List<Task> listPriorityShortError = taskList.stream().filter(task -> task.getPriority().equals("Низкий") && task.getTaskType().equals("Ошибка")).toList();
        List<Task> listPriorityShortFunc = taskList.stream().filter(task -> task.getPriority().equals("Низкий") && task.getTaskType().equals("Новая функциональность")).toList();

        List<Task> taskListHigh = Stream.concat(listPriorityHighError.stream(), listPriorityHighFunc.stream()).toList();
        List<Task> taskListMiddle = Stream.concat(listPriorityMiddleError.stream(), listPriorityMiddleFunc.stream()).toList();
        List<Task> taskListShort = Stream.concat(listPriorityShortError.stream(), listPriorityShortFunc.stream()).toList();

        List<Task> taskListHighAndMiddle = Stream.concat(taskListHigh.stream(), taskListMiddle.stream()).toList();
        List<Task> taskListResponse = Stream.concat(taskListHighAndMiddle.stream(), taskListShort.stream()).toList();


        return taskFactory.createListTaskResponse(taskListResponse);
    }
}
