package com.avispa.issue.a;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
@RestController
@RequestMapping("/v1/a")
public class AController extends ABaseController<ABody> {
    @Override
    public void add(ABody body, BindingResult bindingResult) {
        // DO STH
    }

    @Override
    public void update(UUID id, ABody body, BindingResult bindingResult) {
        // DO STH
    }
}
