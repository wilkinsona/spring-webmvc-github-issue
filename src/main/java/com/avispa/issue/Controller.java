package com.avispa.issue;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
@RestController
@RequestMapping("/v1/test-document")
public class Controller implements BaseController {
    @Override
    public void update(UUID id, Body body, BindingResult bindingResult) {
        // DO STH
    }

    @Override
    public void delete(UUID id) {
        // DO STH
    }
}