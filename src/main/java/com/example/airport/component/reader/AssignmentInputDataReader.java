package com.example.airport.component.reader;

import com.example.airport.data.model.AssignmentEntity;
import com.example.airport.data.model.CountryEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class AssignmentInputDataReader extends InputReader<AssignmentEntity> {


    protected List<AssignmentEntity> buildEntities(List<String[]> countryRecords) {
        //"localPlacementNumber","globalAssignmentId","employeeNumber"
        final List<AssignmentEntity> assignmentEntities = new ArrayList<>();

        setKeyToIndexMap(countryRecords.get(0));
        if (countryRecords != null && countryRecords.size() > 2) {
            countryRecords.stream().skip(1).forEach(
                    record -> {
                        setRecords(record);
                        AssignmentEntity country = AssignmentEntity.builder()
                                .localPlacementNumber(getValueByKey("local_placement_id"))
                                .globalAssignmentId(getValueByKey("global_assignment_id"))
                                .employeeNumber(getValueByKey("employeeNumber")).build();
                        assignmentEntities.add(country);
                    }
            );
        }
        return assignmentEntities;
    }


}
