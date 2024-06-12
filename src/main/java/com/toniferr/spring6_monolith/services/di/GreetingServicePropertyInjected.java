package com.toniferr.spring6_monolith.services.di;

import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!!";
    }
}
