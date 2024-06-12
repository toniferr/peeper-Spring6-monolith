package com.toniferr.spring6_monolith.controllers;


import org.springframework.stereotype.Controller;

/**
 * Created by toniferr
 */
@Controller
public class MyControllerCtx {

    public String sayHello(){
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
