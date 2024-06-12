package com.toniferr.spring6_monolith.controllers.i18n;

import com.toniferr.spring6_monolith.controllers.di.i18n.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


//comment out active profile to test use of default profile
@ActiveProfiles("EN")
@SpringBootTest
class myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}