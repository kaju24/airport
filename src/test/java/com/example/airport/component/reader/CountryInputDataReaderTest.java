package com.example.airport.component.reader;

import com.example.airport.data.model.CountryEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CountryInputDataReaderTest {

    @Autowired
    CountryInputDataReader countryInputDataReader;

    @Test
    public void processInputCountryTest() {
        final Path path = Paths.get("src/test/resources/csv/countries.csv");
        final List<CountryEntity> inputRecords = countryInputDataReader.processInput(path);
        assertNotNull(inputRecords);
        assertEquals(3,inputRecords.size());

    }

    @Test
    public void processInputNullTest()  {
        final List<CountryEntity> inputRecords = countryInputDataReader.processInput(null);
        assertNull(inputRecords);
    }
}
