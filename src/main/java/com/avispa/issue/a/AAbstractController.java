package com.avispa.issue.a;

import com.avispa.issue.Controller;
import com.avispa.issue.Body;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
abstract class AAbstractController<B extends Body> implements Controller {
    @Override
    public void delete(UUID id) {
        // DO STH
    }
}
