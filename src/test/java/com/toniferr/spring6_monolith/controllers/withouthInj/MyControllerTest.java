package com.toniferr.spring6_monolith.controllers.withouthInj;

import com.toniferr.spring6_monolith.controllers.di.withoutInj.MyController;
import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}