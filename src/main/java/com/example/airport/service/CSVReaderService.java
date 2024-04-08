package com.example.airport.service;

import com.example.airport.data.model.AssignmentEntity;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

public interface CSVReaderService {

    public List<String[]> readAllLines(InputStream inputStream) throws Exception;



    void writeAllLines(List<AssignmentEntity> outPutString, String filePath) throws Exception;
}
