package com.hacaton.hacaton_05_04_2024.controller;

import com.hacaton.hacaton_05_04_2024.common.exception.NotDoneProjectException;
import com.hacaton.hacaton_05_04_2024.domain.dto.request.CreateProjectRequest;
import com.hacaton.hacaton_05_04_2024.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProjectController {

    ProjectService projectService;

    @GetMapping("/project/new")
    ResponseEntity createProject(@RequestBody CreateProjectRequest createProjectRequest) {
        if (projectService.createProject(createProjectRequest))
            return ResponseEntity.ok().build();
        else
            throw new NotDoneProjectException("Не создался Проект");
    }
}
