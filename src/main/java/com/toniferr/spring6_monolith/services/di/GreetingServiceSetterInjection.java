package com.toniferr.spring6_monolith.services.di;

import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }
}
