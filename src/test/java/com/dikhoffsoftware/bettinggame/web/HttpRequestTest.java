package com.dikhoffsoftware.bettinggame.web;

import com.dikhoffsoftware.bettinggame.service.MessageService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    private static final String MESSAGE = "A_MESSAGE";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MessageService messageService;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        Mockito.when(messageService.getMessage()).thenReturn(MESSAGE);

        String response = this.restTemplate.getForObject("http://localhost:" + port + "/api/public", String.class);
        assertTrue(response.contains(MESSAGE), "Expected " + MESSAGE + ", but was " + response);
    }
}