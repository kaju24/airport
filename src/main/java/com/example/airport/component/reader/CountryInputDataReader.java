package com.example.airport.component.reader;

import com.example.airport.data.model.CountryEntity;
import com.example.airport.exception.InputDataReadException;
import com.example.airport.service.CsvReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class CountryInputDataReader extends InputReader<CountryEntity> {


    protected List<CountryEntity> buildEntities(List<String[]> countryRecords) {
        //"id","code","name","continent","wikipedia_link","keywords"
        final List<CountryEntity> countryEntities = new ArrayList<>();
        if (countryRecords != null && countryRecords.size() > 2) {
            countryRecords.stream().skip(1).forEach(
                    record -> {
                        CountryEntity country = CountryEntity.builder()
                                .id(Long.valueOf(record[0]))
                                .code(record[1])
                                .name(record[2])
                                .continent(record[3])
                                .wikipedia_Link(record[4])
                                .keywords(record[5]).build();
                        countryEntities.add(country);
                    }
            );
        }
        return countryEntities;
    }


}
