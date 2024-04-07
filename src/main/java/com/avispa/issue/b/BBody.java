package com.avispa.issue.b;

import com.avispa.issue.Body;
import jakarta.validation.constraints.NotNull;

/**
 * @author Rafał Hiszpański
 */
public class BBody implements Body {
    @NotNull
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
