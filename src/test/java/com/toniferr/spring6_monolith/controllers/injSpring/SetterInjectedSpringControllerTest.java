package com.toniferr.spring6_monolith.controllers.injSpring;

import com.toniferr.spring6_monolith.controllers.di.injSpring.SetterInjectedSpringController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedSpringControllerTest {

    @Autowired
    SetterInjectedSpringController setterInjectedSpringController;

    @Test
    void sayHello() {
        System.out.println(setterInjectedSpringController.sayHello());
    }
}