package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingService;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:52
 * @project sfg-di
 **/
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
