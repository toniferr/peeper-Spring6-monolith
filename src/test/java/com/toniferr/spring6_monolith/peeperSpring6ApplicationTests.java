package com.toniferr.spring6_monolith;

import com.toniferr.spring6_monolith.controllers.MyControllerCtx;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class peeperSpring6ApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyControllerCtx myControllerCtx;

    @Test
    void testAutowireOfController() {
        System.out.println(myControllerCtx.sayHello());
    }

    @Test
    void testGetControllerFromCtx() {
        MyControllerCtx myControllerCtx = applicationContext.getBean(MyControllerCtx.class);
        System.out.println(myControllerCtx.sayHello());
    }

    @Test
    void contextLoads() {
    }
}
