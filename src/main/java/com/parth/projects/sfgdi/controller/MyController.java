package com.parth.projects.sfgdi.controller;

import org.springframework.stereotype.Controller;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 01:30
 * @project sfg-di
 **/
@Controller //Because of this annotation,
// spring realises this is supposed to be managed by the framework itself through the application context
// so the application context creates a new object as in 'new MyController()' and maintains it as well,
// there by going forward injecting every other component which needs an instance of 'MyController' with this object
public class MyController {

    public String greet(){
        System.out.println("Greetings from the bat cave");
        return "Greetings from the bat cave";
    }
}
