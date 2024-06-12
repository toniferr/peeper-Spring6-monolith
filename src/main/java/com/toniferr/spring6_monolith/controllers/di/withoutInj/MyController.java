package com.toniferr.spring6_monolith.controllers.di.withoutInj;

import com.toniferr.spring6_monolith.services.di.GreetingService;
import com.toniferr.spring6_monolith.services.di.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created by toniferr.
 */
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
