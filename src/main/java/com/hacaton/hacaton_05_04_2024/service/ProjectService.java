package com.hacaton.hacaton_05_04_2024.service;

import com.hacaton.hacaton_05_04_2024.domain.dto.request.CreateProjectRequest;

public interface ProjectService {
    Boolean createProject(CreateProjectRequest createProjectRequest);
}
