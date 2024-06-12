package com.toniferr.spring6_monolith.controllers.injWithoutSpring;

import com.toniferr.spring6_monolith.controllers.di.injWithoutSpring.PropertyInjectedController;
import com.toniferr.spring6_monolith.services.di.withoutSpring.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}