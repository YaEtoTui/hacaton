package com.hacaton.hacaton_05_04_2024.controller;

import com.hacaton.hacaton_05_04_2024.domain.dto.response.TaskResponse;
import com.hacaton.hacaton_05_04_2024.service.TaskService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class TaskController {

    TaskService taskService;

    @ModelAttribute("listTasks")
    public List<TaskResponse> listTasks(){
        return new ArrayList<>();
    }

    @GetMapping("/")
    String showMainPage(Model model) {
        model.addAttribute("listTasks", taskService.showListTasks());
        return "main";
    }

    @GetMapping("/list/tasks/priority")
    String showListPriority(Model model) {
        model.addAttribute("listTasks", taskService.showListPriority());
        return "main";
    }
}
