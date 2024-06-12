package com.toniferr.spring6_monolith.controllers.di.environments;

import com.toniferr.spring6_monolith.services.di.environments.EnvironmentService;
import org.springframework.stereotype.Controller;

/**
 * Created by toniferr.
 */
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
