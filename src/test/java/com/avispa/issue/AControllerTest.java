package com.avispa.issue;

import com.avispa.issue.a.ABody;
import com.avispa.issue.a.AController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Rafał Hiszpański
 */
@WebMvcTest(AController.class)
class AControllerTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void givenDto_whenUpdate_thenServiceCalled() throws Exception {
        ABody body = new ABody();
        body.setTest("Value");

        UUID id = UUID.randomUUID();

        mockMvc.perform(MockMvcRequestBuilders.post("/v1/a/" + id)
                        .contentType(APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(body)))
                .andExpect(status().is(200));
    }

    @Test
    void whenDelete_thenServiceCalled() throws Exception {
        UUID id = UUID.randomUUID();

        mockMvc.perform(MockMvcRequestBuilders.delete("/v1/a/" + id))
                .andExpect(status().is(200));
    }
}