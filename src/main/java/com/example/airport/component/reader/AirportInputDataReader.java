package com.example.airport.component.reader;

import com.example.airport.data.model.AirportEntity;
import com.example.airport.data.model.CountryEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class AirportInputDataReader extends InputReader<AirportEntity> {


    protected List<AirportEntity> buildEntities(List<String[]> airportRecords) {
        //"id","ident","type","name","latitude_deg","longitude_deg","elevation_ft","continent","iso_country","iso_region","municipality","scheduled_service","gps_code","iata_code","local_code","home_link","wikipedia_link","keywords"
        final List<AirportEntity> airportEntities = new ArrayList<>();
        if (airportRecords != null && airportRecords.size() > 2) {
            airportRecords.stream().skip(1).forEach(
                    record -> {
                        AirportEntity airportEntity = AirportEntity.builder().
                        id(Long.valueOf(record[0]))
                                .build();
                        airportEntities.add(airportEntity);
                    }
            );
        }
        return airportEntities;
    }


}
