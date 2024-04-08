package com.example.airport.service.impl;

import nl.randstadgroep.rone.talent.assignment.model.Assignment;

public interface LocalMondriaanServices {
    /**
     * Retrieves assignment details for give assigment number from Mondriaan
     *
     * @param assignmentNumber given assignment number to retirieve details
     * @return instance of {#{@link Assignment}
     * @throws
     */
    Assignment retrieveAssignmentDetails(String assignmentNumber);


}
