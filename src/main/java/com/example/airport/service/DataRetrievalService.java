package com.example.airport.service;

import com.example.airport.data.model.RunwayEntity;

import java.util.Set;

public interface DataRetrievalService {
    Set<RunwayEntity> retrieveRunwaysByCountryCodeOrName(String countryCode, String countryName);
}