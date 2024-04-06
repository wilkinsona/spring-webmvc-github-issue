package com.avispa.issue;

import jakarta.validation.constraints.NotNull;

/**
 * @author Rafał Hiszpański
 */
public class Body {
    @NotNull
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
