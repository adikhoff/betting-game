package com.dikhoffsoftware.bettinggame.web;

import com.dikhoffsoftware.bettinggame.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
public class APIController {

    private MessageService messageService;

    @Autowired
    public APIController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = "/public")
    public Message publicEndpoint() {
        return new Message(messageService.getMessage());
    }
}