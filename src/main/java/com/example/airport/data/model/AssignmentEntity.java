package com.example.airport.data.model;

import lombok.*;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Builder
public class AssignmentEntity implements Serializable {
    private String localPlacementNumber;
    private String globalAssignmentId;
    private String employeeNumber;

}

