package com.example.airport.component.reader;

import com.example.airport.exception.InputDataReadException;
import com.example.airport.service.CsvReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.Path;
import java.util.List;
@Slf4j
public abstract class InputReader<T> {

    @Autowired
    CsvReader csvReader;

    public List<T> processInput(final Path path) {
        try {
            if (path != null) {
                final List<String[]> countryRecords = csvReader.readAllLines(path);
                return buildEntities(countryRecords);
            } else {
                log.warn("Provided path of input file is null");
                return null;
            }

        } catch (Exception e) {
            log.error("An error occurred while reading data from path {}", path.toUri(), e);
            throw new InputDataReadException("An error occurred while reading data", e);

        }
    }

    abstract List<T> buildEntities(List<String[]> countryRecords);
}
