package com.toniferr.spring6_monolith.services.di.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by toniferr.
 */
@Profile("qa")
@Service
public class EnvironmentServiceQA implements EnvironmentService {

    @Override
    public String getEnv() {
        return "qa";
    }
}
