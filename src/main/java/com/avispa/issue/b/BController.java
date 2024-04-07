package com.avispa.issue.b;

import com.avispa.issue.a.ABody;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
@RestController
@RequestMapping("/v1/b")
public class BController extends BBaseController<BBody> {
    @Override
    public void add(BBody body, BindingResult bindingResult) {
        // DO STH
    }

    @Override
    public void update(UUID id, BBody body, BindingResult bindingResult) {
        // DO STH
    }
}