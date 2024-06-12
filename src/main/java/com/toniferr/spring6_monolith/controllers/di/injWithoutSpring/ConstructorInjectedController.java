package com.toniferr.spring6_monolith.controllers.di.injWithoutSpring;

import com.toniferr.spring6_monolith.services.di.GreetingService;

/**
 * Created by toniferr.
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
