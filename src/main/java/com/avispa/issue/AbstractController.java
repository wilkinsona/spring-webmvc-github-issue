package com.avispa.issue;

import org.springframework.validation.BindingResult;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
public abstract class AbstractController<T extends Object> implements BaseController<T> {
    @Override
    public void delete(UUID id) {
        // DO STH
    }
}
