package io.ayers.springdependencyinjection.controllers;

import io.ayers.springdependencyinjection.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectedController {

    @Autowired
    @Qualifier("setterGreetingService")
    private IGreetingService greetingService;

    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
