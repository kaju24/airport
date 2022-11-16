package com.example.airport.site.controller;

import com.example.airport.data.model.CountryEntity;
import com.example.airport.data.model.RunwayEntity;
import com.example.airport.service.DataRetrievalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

/**
 * Spring controller to handle home page call.
 */
@Controller
@Slf4j
public class HomeController {

    @Autowired
    DataRetrievalService dataRetrievalService;

    @GetMapping("/")
    public String home(Model model,
                       @RequestParam(name = "owningEntityStatisticFilter", required = false) final String appliedOwningEntityFilter) {

        model.addAttribute("hello", "welcome my friend");
        return "home";
    }

    @GetMapping("/test")
    public String runwaysByCountrySubmit(Model model, @RequestParam(name = "code", required = false) final String countryCode,
                                 @RequestParam(name = "name", required = false) final String countryName) {
        final Set<RunwayEntity> runwayEntities = dataRetrievalService.retrieveRunwaysByCountryCodeOrName(countryCode, countryName);
        model.addAttribute("runways", runwayEntities);
        return "home";
    }

    @GetMapping("/countries")
    public String topTenCountriesByNumberOfAirports(Model model) {
        final List<CountryEntity> countryEntities = dataRetrievalService.retrieveTop10CountriesWithMaximumNumberOfAirport();
        model.addAttribute("countries", countryEntities);
        return "home";
    }

    @GetMapping("/search")
    public String topTenCountriesByNumberOfAirports(Model model, @RequestParam(name = "keyword", required = true) final String keyword) {
        final List<CountryEntity> countryEntities = dataRetrievalService.fuzzySearchCountryByName(keyword);
        model.addAttribute("countriesFuzzy", countryEntities);
        return "home";
    }
}
