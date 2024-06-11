package com.toniferr.spring6_monolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.toniferr.spring6_monolith.controllers.MyController;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =  SpringApplication.run(Spring6WebappApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
