package com.dikhoffsoftware.bettinggame.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {

    @Test
    void messageServiceResponds() {
        MessageService service = new MessageService();
        String response = service.getMessage();

        assertEquals("Hello, world!", response);
    }
}
