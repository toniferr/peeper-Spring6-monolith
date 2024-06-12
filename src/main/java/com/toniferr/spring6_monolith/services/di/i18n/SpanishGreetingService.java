package com.toniferr.spring6_monolith.services.di.i18n;

import com.toniferr.spring6_monolith.services.di.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
