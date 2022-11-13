package com.example.airport.component.reader;

import com.example.airport.data.model.AirportEntity;
import com.example.airport.data.model.CountryEntity;
import com.example.airport.data.model.RunwayEntity;
import com.example.airport.data.repository.AirportRepository;
import com.example.airport.data.repository.CountryRepository;
import com.example.airport.data.repository.RunwayRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PopulateDatabaseTest {

    @Autowired
    PopulateDatabase populateDatabase;
    @Autowired
    CountryRepository countryRepository;

    @Autowired
    RunwayRepository runwayRepository;

    @Autowired
    AirportRepository airportRepository;

    @Test
    public void onApplicationEventTest(){
        populateDatabase.onApplicationEvent(null);
        final List<CountryEntity> countryEntities = countryRepository.findAll();
        assertNotNull(countryEntities);
        assertEquals(3,countryEntities.size());

        final List<RunwayEntity> runwayEntities = runwayRepository.findAll();
        assertNotNull(runwayEntities);
        assertEquals(9,runwayEntities.size());


        final List<AirportEntity> airportEntities = airportRepository.findAll();
        assertNotNull(airportEntities);
        assertEquals(19,airportEntities.size());
    }
}
