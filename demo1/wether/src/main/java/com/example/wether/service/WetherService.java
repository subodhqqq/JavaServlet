package com.example.wether.service;

import com.example.wether.model.wetherModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.math.BigDecimal;
import java.net.URI;

@Service
public class WetherService {
    private static final String Weather_Apikey = "http://api.openweathermap.org/data/2.5/weather?q=Kathmandu,nepal&appid=4c4343e7f9ff2c7e5d62a48c6d1cdcfd";

    private final RestTemplate restTemplate;//rest template le chahi json form ma api data tanxa
    private final ObjectMapper objectMapper;//object mapper le chahi json from ko data lai object from ma convert garxa


    public WetherService(RestTemplateBuilder restTemplateBuilder, ObjectMapper objectMapper) {
        this.restTemplate = restTemplateBuilder.build();//rest templet lai resttemplete builder lai configure garira xa
        this.objectMapper = objectMapper;
    }
    public wetherModel getCurrentWeather(String city,String countary){
        URI uri=null;
        uri=new UriTemplate(Weather_Apikey).expand(city,countary);
        ResponseEntity<String> responseEntity=
                restTemplate.getForEntity(Weather_Apikey,String.class);//object from ma vayako data lai string ma string from ma store ra  conveted garxa
        return convert(responseEntity);

    }

    public wetherModel convert(ResponseEntity<String> responseEntity) {
        try {
            JsonNode root = objectMapper.readTree(responseEntity.getBody());//object mapper le root ma description temp  feels_like ra speed lai object ko from ma convert garxa

            return new wetherModel(root.path("weather").get(0).path("description").asText(),//value off ma store garxa aako value
                    BigDecimal.valueOf(root.path("main").path("temp").asDouble()),
                    BigDecimal.valueOf(root.path("main").path("feels_like").asDouble()),
                    BigDecimal.valueOf(root.path("wind").path("speed").asDouble()));

        } catch (JsonProcessingException e) {
            throw  new RuntimeException("error");
        }

    }
}