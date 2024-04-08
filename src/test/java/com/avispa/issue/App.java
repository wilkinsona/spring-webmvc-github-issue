package com.avispa.issue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Rafał Hiszpański
 */
@EnableWebMvc
@ComponentScan
@Configuration
public class App {
    @Bean
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
