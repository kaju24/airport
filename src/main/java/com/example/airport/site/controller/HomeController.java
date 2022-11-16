package com.example.airport.site.controller;

import com.example.airport.data.model.RunwayEntity;
import com.example.airport.service.DataRetrievalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String greetingSubmit(Model model, @RequestParam(name = "code", required = false) final String countryCode,
                                 @RequestParam(name = "name", required = false) final String countryName) {
        final Set<RunwayEntity> runwayEntities = dataRetrievalService.retrieveRunwaysByCountryCodeOrName(countryCode, countryName);
        model.addAttribute("runways", runwayEntities);
        return "home";
    }
}
