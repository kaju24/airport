package com.example.airport.service.impl;

import com.example.airport.data.model.AirportEntity;
import com.example.airport.data.model.CountryEntity;
import com.example.airport.data.model.RunwayEntity;
import com.example.airport.data.repository.CountryRepository;
import com.example.airport.service.DataRetrievalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * Data rerievel layer interact with data repository in transactional manner
 */
@Service
@Transactional
public class DataRetrievalServiceImpl implements DataRetrievalService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Set<RunwayEntity> retrieveRunwaysByCountryCodeOrName(final String countryCode, final String countryName){
        final CountryEntity country = countryRepository.findByCodeOrName(countryCode, countryName);
        final Set<AirportEntity> airports = country.getAirports();
        final Set<RunwayEntity> runwayEntities =  new HashSet<>();

        for (AirportEntity airport : airports){
            runwayEntities.addAll(airport.getRunways());
        }
        return runwayEntities;
    }

}
