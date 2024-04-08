package com.example.airport.service.impl;


import com.example.airport.data.model.AssignmentEntity;
import com.example.airport.service.CSVReaderService;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
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

    @Override
    public void writeAllLines(List<AssignmentEntity> outPutString,String filePath) throws Exception {
        File file = new File(filePath);
        FileWriter outputfile = new FileWriter(file,true);
        //using custom delimiter and quote character
        CSVWriter csvWriter = new CSVWriter(outputfile);
        List<String[]> data = toStringArray(outPutString);

       data.forEach(d -> csvWriter.writeNext(d));
        csvWriter.close();
    }

    private static List<String[]> toStringArray(List<AssignmentEntity> emps) {
        List<String[]> records = new ArrayList<String[]>();

        // adding header record
      //  records.add(new String[] { "local_placement_id", "global_assignment_id", "employee_number"});

        Iterator<AssignmentEntity> it = emps.iterator();
        while (it.hasNext()) {
            AssignmentEntity assignment = (AssignmentEntity) it.next();
            records.add(new String[] { assignment.getLocalPlacementNumber(), assignment.getGlobalAssignmentId(), assignment.getEmployeeNumber() });
        }
        return records;
    }

}
