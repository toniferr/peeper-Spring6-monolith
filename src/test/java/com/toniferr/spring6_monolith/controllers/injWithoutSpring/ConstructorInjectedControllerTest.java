package com.toniferr.spring6_monolith.controllers.injWithoutSpring;

import com.toniferr.spring6_monolith.controllers.di.injWithoutSpring.ConstructorInjectedController;
import com.toniferr.spring6_monolith.services.di.withoutSpring.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}