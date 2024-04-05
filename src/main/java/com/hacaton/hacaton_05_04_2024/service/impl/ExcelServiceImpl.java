package com.hacaton.hacaton_05_04_2024.service.impl;

import com.hacaton.hacaton_05_04_2024.service.ExcelService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ExcelServiceImpl implements ExcelService {
    @Override
    public boolean readExcel(MultipartFile file) {
        try {
            Workbook workbook = WorkbookFactory.create((InputStream) file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
