package com.avispa.issue;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

/**
 * @author Rafał Hiszpański
 */
public interface Controller {
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    void add(@RequestBody Body body, BindingResult bindingResult);

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void update(@PathVariable("id") UUID id, @RequestBody Body body, BindingResult bindingResult);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable("id") UUID id);
}
