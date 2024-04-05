package com.hacaton.hacaton_05_04_2024.service.impl;

import com.hacaton.hacaton_05_04_2024.domain.context.ContextProject;
import com.hacaton.hacaton_05_04_2024.domain.dto.request.CreateProjectRequest;
import com.hacaton.hacaton_05_04_2024.domain.entity.Project;
import com.hacaton.hacaton_05_04_2024.repository.ProjectRepository;
import com.hacaton.hacaton_05_04_2024.service.ProjectService;
import com.hacaton.hacaton_05_04_2024.service.factory.ProjectFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    ProjectFactory projectFactory;
    ProjectRepository projectRepository;

    @Override
    public Boolean createProject(CreateProjectRequest createProjectRequest) {
        ContextProject contextProject =  projectFactory.createContextProject(createProjectRequest);
        Project project = new Project(contextProject);
        Project projectEntity = projectRepository.save(project);
        return true;
    }
}
