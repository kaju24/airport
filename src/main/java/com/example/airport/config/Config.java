package com.example.airport.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import nl.randstadgroep.nextgen.gm.assignment.client.api.AssignmentClient;
import nl.randstadgroep.nextgen.gm.assignment.client.api.AssignmentClientApi;
import nl.randstadgroep.nextgen.gm.assignment.client.api.impl.AssignmentClientImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    public AssignmentClient assignmentClient() {
        return new AssignmentClientImpl(createAssignmentClientApi());
    }

    private AssignmentClientApi createAssignmentClientApi() {
        return new AssignmentClientApi("https://nextgen.fac.rgn/mgmAssignmentAPI", 2);
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        // add converter with offset datetime instead of unix timestamp
        restTemplate.getMessageConverters().add(0, mappingJacksonHttpMessageConverter());
        return restTemplate;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(localObjectMapper());
        return converter;
    }

    @Bean(name = "local-object-mapper")
    public ObjectMapper localObjectMapper() {
        ObjectMapper mapper = createObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        mapper.registerModule(new JavaTimeModule());
      //  mapper.setDateFormat(new RFC3339DateFormat());

        return mapper;
    }

    public static ObjectMapper createObjectMapper() {
        return Jackson2ObjectMapperBuilder.json()
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .featuresToEnable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, SerializationFeature.WRITE_ENUMS_USING_TO_STRING, SerializationFeature.INDENT_OUTPUT, DeserializationFeature.READ_ENUMS_USING_TO_STRING)
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .build();
    }
}
