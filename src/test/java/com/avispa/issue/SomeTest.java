package com.avispa.issue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
class SomeTest {
    @Test
    void simple() {
        Body body = new Body();
        body.setTest("Value");

        assertEquals("Value", body.getTest());
    }
}
