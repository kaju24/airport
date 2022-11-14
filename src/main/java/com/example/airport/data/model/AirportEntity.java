package com.example.airport.data.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "airports")
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class AirportEntity implements Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private CountryEntity country;

    @Column
    private String identity;
    @Column
    private String type;
    @Column
    private String name;
    @Column
    private Double latitude_deg;
    @Column
    private Double longitude_deg;
    @Column
    private Double elevation_ft;
    @Column
    private String continent;
    @Column
    private String iso_country;
    @Column
    private String iso_region;
    @Column
    private String municipality;
    @Column
    private String scheduled_service;
    @Column
    private String gps_code;
    @Column
    private String iata_code;
    @Column
    private String local_code;
    @Column
    private String home_link;
    @Column
    private String wikipedia_link;
    @Lob
    @Column
    private String keywords;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "airport")
    private Set<RunwayEntity> runways = new HashSet<>(0);

}
