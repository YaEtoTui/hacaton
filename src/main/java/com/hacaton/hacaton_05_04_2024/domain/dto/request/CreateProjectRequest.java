package com.hacaton.hacaton_05_04_2024.domain.dto.request;

import lombok.Value;

@Value
public class CreateProjectRequest {
    String name;
    String description;
    String dateStart;
    String dateEnd;
}
