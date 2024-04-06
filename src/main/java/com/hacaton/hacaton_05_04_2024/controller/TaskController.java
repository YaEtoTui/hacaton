package com.hacaton.hacaton_05_04_2024.controller;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;
import com.hacaton.hacaton_05_04_2024.service.TaskService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TaskController {

    TaskService taskService;

    @GetMapping("/list/tasks")
    ResponseEntity<List<TaskResponse>> showListTasks() {
        return ResponseEntity.ok()
                .body(taskService.showListTasks());
    }

    @GetMapping("/list/tasks/priority")
    ResponseEntity<List<TaskResponse>> showListPriority() {
        return ResponseEntity.ok()
                .body(taskService.showListPriority());
    }
}
