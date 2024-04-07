package com.avispa.issue;

import com.avispa.issue.a.ABody;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * @author Rafał Hiszpański
 */
@SpringBootTest
@DisplayName("A")
class ASomeTest {
    @Autowired
    private SomeService service;

    @TestConfiguration
    public static class SomeTestConfiguration {
        @Bean
        public Validator localValidatorFactoryBean() {
            return new LocalValidatorFactoryBean();
        }
    }

    @Test
    void simple() {
        ABody body = new ABody();
        body.setTest("Value");

        service.dosth();

        assertEquals("Value", body.getTest());
    }
}
