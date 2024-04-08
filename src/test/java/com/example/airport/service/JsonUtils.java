package com.example.airport.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;

/**
 * Json uti class used to transform to/from json string to/from Java objects
 */
@Slf4j
public class JsonUtils {

    /**
     * Creates Object of {@link ObjectMapper}
     * With registered {@link JavaTimeModule}
     * @return instance of {@link ObjectMapper}
     */
    public static ObjectMapper getObjectMapper() {
        PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder()
                .allowIfSubType(Object.class)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.activateDefaultTyping(ptv, ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, JsonTypeInfo.As.PROPERTY);
        return objectMapper;
    }

    /**
     * Converts Object to Json String
     * @param object to be converted to json string
     * @return Json string for provided object
     * @throws JsonProcessingException throws {@link JsonProcessingException} in case of error in transforming to json string
     */
    public static String getJsonStringFromObject(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = getObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

    /**
     * Creates instance of provided class type from provided json string
     * @param jsonString json string to convert to object
     * @param valueType {@link Class} type of Object to be converted to
     * @param <T>
     * @return return object of provided {@link Class} type
     * @throws {@link JsonProcessingException} in case of error in transforming to Object from json string
     */
    public static <T> T getObjectFromJsonString(String jsonString, Class<T> valueType) throws JsonProcessingException {
        ObjectMapper objectMapper = getObjectMapper();
        return objectMapper.readValue(jsonString, valueType);
    }
}
