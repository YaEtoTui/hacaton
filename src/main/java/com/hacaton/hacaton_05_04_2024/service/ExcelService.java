package com.hacaton.hacaton_05_04_2024.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {
    boolean readExcel(MultipartFile file);
}
