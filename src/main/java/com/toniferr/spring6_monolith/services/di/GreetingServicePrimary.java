package com.toniferr.spring6_monolith.services.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
