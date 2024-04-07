package com.avispa.issue.b;

import com.avispa.issue.Controller;
import com.avispa.issue.Body;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
abstract class BAbstractController<B extends Body> implements Controller<B> {
    @Override
    public void delete(UUID id) {
        // DO STH
    }
}
