package com.toniferr.spring6_monolith.services.di;

import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
