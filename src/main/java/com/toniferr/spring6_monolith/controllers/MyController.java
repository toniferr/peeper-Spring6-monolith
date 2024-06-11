package com.toniferr.spring6_monolith.controllers;


import org.springframework.stereotype.Controller;

/**
 * Created by toniferr
 */
@Controller
public class MyController {

    public String sayHello(){

        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
}
