package io.ayers.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From Property";
    }
}
