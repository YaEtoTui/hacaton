package com.hacaton.hacaton_05_04_2024.service.factory;

import com.hacaton.hacaton_05_04_2024.domain.context.ContextProject;
import com.hacaton.hacaton_05_04_2024.domain.dto.request.CreateProjectRequest;
import org.springframework.stereotype.Component;

@Component
public class ProjectFactory {

    public ContextProject createContextProject(CreateProjectRequest createProjectRequest) {
        return new ContextProject(
                createProjectRequest.getName(),
                createProjectRequest.getDescription(),
                createProjectRequest.getDateStart(),
                createProjectRequest.getDateEnd()
        );
    }

}
