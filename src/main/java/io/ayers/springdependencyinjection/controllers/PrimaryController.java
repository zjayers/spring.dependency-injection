package io.ayers.springdependencyinjection.controllers;

import io.ayers.springdependencyinjection.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final IGreetingService greetingService;

    public PrimaryController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
