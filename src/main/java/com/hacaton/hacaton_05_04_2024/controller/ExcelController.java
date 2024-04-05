package com.hacaton.hacaton_05_04_2024.controller;

import com.hacaton.hacaton_05_04_2024.service.ExcelService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ExcelController {

    ExcelService excelService;

    @PostMapping("/file/excel")
    ResponseEntity<Boolean> readExcel(MultipartFile file) {
        return ResponseEntity
                .ok()
                .body(excelService.readExcel(file));
    }
}
