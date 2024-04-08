package com.example.airport.service;

import lombok.extern.slf4j.Slf4j;
import nl.randstadgroep.roneadapter.webapi.model.model.Notificatie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
@Slf4j
@Service
public class BesService {

    private final RestTemplate restTemplate;
    private static final String TOPIC_PLACEHOLDER = "topic";
    final String endpoint ="https://nextgen-api.fac.rgn/t/apk.fac/bes/rest/1/publish/{topic}";


    @Autowired
    public BesService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;

    }

    public void publish(final String topic, final Notificatie message) {

        final ResponseEntity<String> response;
        try {

            response = restTemplate.postForEntity(endpoint, message, String.class, Map.of(TOPIC_PLACEHOLDER, topic));
        } catch (final RestClientException e) {
            throw e;
        }

        if (!response.getStatusCode().is2xxSuccessful()) {

            throw new RuntimeException("Publish to BES was not successful, status code: " + response.getStatusCode());
        }
    }
}
