package com.toniferr.spring6_monolith.controllers.di.injWithoutSpring;

import com.toniferr.spring6_monolith.services.di.GreetingService;

/**
 * Created by toniferr.
 * Si esta clase es instanciada pero no se establece el service, dará nullpointer.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
