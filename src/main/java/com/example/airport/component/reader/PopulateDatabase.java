package com.example.airport.component.reader;

import com.example.airport.data.model.AirportEntity;
import com.example.airport.data.model.CountryEntity;
import com.example.airport.data.model.RunwayEntity;
import com.example.airport.data.repository.AirportRepository;
import com.example.airport.data.repository.CountryRepository;
import com.example.airport.data.repository.RunwayRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
@Component
public class PopulateDatabase implements ApplicationListener<ApplicationReadyEvent>, Ordered {


    @Autowired
    CountryInputDataReader countryReader;

    @Autowired
    AirportInputDataReader airportInputDataReader;

    @Autowired
    RunwayInputDataReader runwayInputDataReader;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    RunwayRepository runwayRepository;

    @Autowired
    AirportRepository airportRepository;


    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        // In case of big CSV file the insert should be done in pagination, avoiding that complexity due to small size of data
        log.info("Loading country data it will take a while....");
        final Path conutryPath = Paths.get("src/test/resources/csv/countries.csv");
        final List<CountryEntity> countryEntities = countryReader.processInput(conutryPath);
        countryRepository.saveAll(countryEntities);
        log.info("Loading country completed");

        log.info("Loading airport data it will take a while....");
        final Path aisrportPath = Paths.get("src/test/resources/csv/airports.csv");
        final List<AirportEntity> airportEntities = airportInputDataReader.processInput(aisrportPath);
        airportRepository.saveAll(airportEntities);
        log.info("Loading airport completed");


        log.info("Loading runways data it will take a while....");
        final Path path = Paths.get("src/test/resources/csv/runways.csv");
        final List<RunwayEntity> runwayEntities = runwayInputDataReader.processInput(path);
        runwayRepository.saveAll(runwayEntities);
        log.info("Loading runways completed");
    }

    /**
     * Populate data at end of application deployment
     *
     * @return
     */
    @Override
    public int getOrder() {
        return -1;
    }
}
