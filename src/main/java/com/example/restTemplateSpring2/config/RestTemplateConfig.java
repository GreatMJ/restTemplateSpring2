package com.example.restTemplateSpring2.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
//    @Bean
//    public RestTemplate getRestTemplateInstance(RestTemplateBuilder restTemplateBuilder){
//        return restTemplateBuilder.build();
//    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}
