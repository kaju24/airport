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
        //"id","ident","type","name","latitude_deg","longitude_deg","elevation_ft","continent","iso_country","iso_region",
        // "municipality","scheduled_service","gps_code","iata_code","local_code","home_link","wikipedia_link","keywords"
        final List<AirportEntity> airportEntities = new ArrayList<>();
        if (airportRecords != null && airportRecords.size() > 2) {

           setKeyToIndexMap(airportRecords.get(0));

            airportRecords.stream().skip(1).forEach(
                    record -> {
                        setRecords(record);
                        AirportEntity airportEntity = AirportEntity.builder().
                        id(getLongValueByKey("id"))
                                .identity(getValueByKey("ident"))
                                .type(getValueByKey("type"))
                                .name(getValueByKey("name"))
                                .latitude_deg(getDoubleValueByKey("latitude_deg"))
                                .longitude_deg(getDoubleValueByKey("longitude_deg"))
                                .elevation_ft(getDoubleValueByKey("elevation_ft"))
                                .continent(getValueByKey("continent"))
                                .iso_country(getValueByKey("iso_country"))
                                .iso_region(getValueByKey("iso_region"))
                                .municipality(getValueByKey("municipality"))
                                .scheduled_service(getValueByKey("scheduled_service"))
                                .gps_code(getValueByKey("gps_code"))
                                .iata_code(getValueByKey("iata_code"))
                                .local_code(getValueByKey("local_code"))
                                .home_link(getValueByKey("home_link"))
                                .wikipedia_link(getValueByKey("wikipedia_link"))
                                .keywords(getValueByKey("keywords"))
                                .build();
                        airportEntities.add(airportEntity);
                    }
            );
        }
        return airportEntities;
    }


}
