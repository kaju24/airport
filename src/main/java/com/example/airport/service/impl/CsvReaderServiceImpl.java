package com.example.airport.service.impl;


import com.example.airport.service.CSVReaderService;
import com.opencsv.CSVReader;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
@Service
public class CsvReaderServiceImpl implements CSVReaderService {

    /**
     *
     * @param inputStream
     * @return
     * @throws Exception
     */
    @Override
    public List<String[]> readAllLines(InputStream inputStream) throws Exception {
        if(inputStream != null){
            try (Reader reader = new InputStreamReader(inputStream)) {
                try (CSVReader csvReader = new CSVReader(reader)) {
                    return csvReader.readAll();
                }
            }
        }
        return null;

    }
}
