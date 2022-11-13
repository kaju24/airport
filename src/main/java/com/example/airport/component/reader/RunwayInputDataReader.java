package com.example.airport.component.reader;

import com.example.airport.data.model.RunwayEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class RunwayInputDataReader extends InputReader<RunwayEntity> {


    protected List<RunwayEntity> buildEntities(List<String[]> runwayRecords) {
       // "id","airport_ref","airport_ident","length_ft","width_ft","surface","lighted","closed","le_ident","le_latitude_deg","le_longitude_deg","le_elevation_ft","le_heading_degT","le_displaced_threshold_ft","he_ident","he_latitude_deg","he_longitude_deg","he_elevation_ft","he_heading_degT","he_displaced_threshold_ft"
        final List<RunwayEntity> runwayEntities = new ArrayList<>();
        if (runwayRecords != null && runwayRecords.size() > 2) {
            runwayRecords.stream().skip(1).forEach(
                    record -> {
                        RunwayEntity runwayEntity = RunwayEntity.builder().build();

                        runwayEntities.add(runwayEntity);
                    }
            );
        }
        return runwayEntities;
    }


}
