package com.toniferr.spring6_monolith.controllers.injWithoutSpring;

import com.toniferr.spring6_monolith.controllers.di.injWithoutSpring.SetterInjectedController;
import com.toniferr.spring6_monolith.services.di.withoutSpring.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}