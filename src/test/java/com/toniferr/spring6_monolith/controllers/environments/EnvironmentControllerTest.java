package com.toniferr.spring6_monolith.controllers.environments;

import com.toniferr.spring6_monolith.controllers.di.environments.EnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;

    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());

    }
}