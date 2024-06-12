package com.toniferr.spring6_monolith.services.di.withoutSpring;

import com.toniferr.spring6_monolith.services.di.GreetingService;

/**
 * Created by toniferr.
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
