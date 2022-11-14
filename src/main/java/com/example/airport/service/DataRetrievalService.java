package com.example.airport.service;

import com.example.airport.data.model.RunwayEntity;

import java.util.Set;

public interface DataRetrievalService {
    Set<RunwayEntity> retrieveRunwaysVyCountryCodeOrName(String countryCode, String countryName);
}
