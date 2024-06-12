package com.toniferr.spring6_monolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.toniferr.spring6_monolith.controllers.MyControllerCtx;

@SpringBootApplication
public class peeperSpring6Application {

    public static void main(String[] args) {

        ApplicationContext ctx =  SpringApplication.run(peeperSpring6Application.class, args);

        MyControllerCtx controller = ctx.getBean(MyControllerCtx.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
