package com.ogbrown.aurorademo.web;

import com.ogbrown.aurorademo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private final MessageService messageService;

    @Autowired
    public HelloWorldController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String sayHello() {
        messageService.saveMessage("Hello, World!", "System");
        return "Hello, World!";
    }
}