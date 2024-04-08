package com.avispa.issue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

/**
 * @author Rafał Hiszpański
 */
@DisplayName("A")
@SpringJUnitWebConfig(classes = App.class)
class SomeTest {
    @Test
    void simple() {
        Body body = new Body();
        body.setTest("Value");

        assertEquals("Value", body.getTest());
    }
}
