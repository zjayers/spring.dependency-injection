package io.ayers.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("ES")
public class I18NSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
