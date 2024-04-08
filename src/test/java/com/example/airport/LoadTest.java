package com.example.airport;

import com.example.airport.component.reader.AssignmentInputDataReader;
import com.example.airport.data.model.AssignmentEntity;
import com.example.airport.service.BesService;
import com.example.airport.service.CSVReaderService;
import com.example.airport.service.EventHelper;
import com.example.airport.service.impl.LocalMondriaanServices;
import lombok.extern.slf4j.Slf4j;
import nl.randstadgroep.rone.talent.assignment.model.Assignment;
import nl.randstadgroep.roneadapter.webapi.model.model.Notificatie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class LoadTest {

    @Autowired
    AssignmentInputDataReader assignmentInputDataReader;
    @Autowired
    LocalMondriaanServices mondriaanServices;
    @Value(value = "classpath:input/csv/assignment/test.csv")
    private Resource assignmentCsv;
    @Autowired
    private CSVReaderService csvReaderService;
    private String filePath = "src/main/resources/input/csv/assignment/test_new.csv";

    @Autowired
    BesService besService;

    @Test
    public void test() throws Exception {
        log.info("Loading assignment data it will take a while....");
        final List<AssignmentEntity> assignmentEntries = assignmentInputDataReader.processInput(assignmentCsv.getInputStream());

        final List<AssignmentEntity> assignmentTobeWrite= new ArrayList<>();


        assignmentEntries.forEach(a -> {
            final Assignment assignment = mondriaanServices.retrieveAssignmentDetails(a.getLocalPlacementNumber());
            if (assignment != null) {
                a.setEmployeeNumber(assignment.getEmployeeNumber());
                assignmentTobeWrite.add(a);
            }


            while (assignmentTobeWrite.size() >= 100) {
                try {
                    csvReaderService.writeAllLines(assignmentTobeWrite, filePath);
                    assignmentTobeWrite.removeAll(assignmentTobeWrite);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        log.info("Loading assigment completed");
    }

    @Test
    public void senNotifications() throws Exception {
        log.info("Loading assignment data it will take a while....");
        final List<AssignmentEntity> assignmentEntries = assignmentInputDataReader.processInput(assignmentCsv.getInputStream());
        log.info("Loading assigment completed");
        final List<AssignmentEntity> assignmentTobeWrite= new ArrayList<>();

        final Notificatie notification = EventHelper.getNotification();
        int max = assignmentEntries.size();
        for(int i=0; i <= max; i++){
            AssignmentEntity e = assignmentEntries.get(i);
            notification.getEmployee().getEmployeeNummer().setValue(e.getEmployeeNumber());
            notification.getAanvraag().getAanvraagNummer().setValue(e.getLocalPlacementNumber());
            besService.publish("muteerPlaatsing",notification);
        }


    }
}
