package com.example.airport.service;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CsvReaderTest {

    @Test
    public void readAllLinesTest() throws Exception {
        final Path path = Paths.get("src/test/resources/csv/countries.csv");
        CsvReader csvReader = new CsvReader();
        final List<String[]> inputRecords = csvReader.readAllLines(path);
        assertNotNull(inputRecords);
        assertEquals(4,inputRecords.size());
    }

    @Test
    public void readAllLinesTestNull() throws Exception {
        CsvReader csvReader = new CsvReader();
        final List<String[]> inputRecords = csvReader.readAllLines(null);
        assertNull(inputRecords);
    }
}
