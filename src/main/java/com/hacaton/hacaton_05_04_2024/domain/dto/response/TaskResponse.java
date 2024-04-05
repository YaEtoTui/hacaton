package com.hacaton.hacaton_05_04_2024.domain.dto.response;

import lombok.Value;

@Value
public class TaskResponse {
    Integer number;
    String title;
    String description;
    String priority;
    String customer;
    String receiver;
    String projectName;
    String team;
    String taskType;
    String status;
    String state;
    String analyst;
    String developer;
    String tester;
    String releaseManager;
    Integer analysis;
    Integer development;
    Integer testing;
    String release;
    String dataCreate;
    String zznumber;
    String blockTaskNumber;
}
