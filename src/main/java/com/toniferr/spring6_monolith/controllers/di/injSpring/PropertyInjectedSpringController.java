package com.toniferr.spring6_monolith.controllers.di.injSpring;

import com.toniferr.spring6_monolith.services.di.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by toniferr.
 */
@Controller
public class PropertyInjectedSpringController {

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
