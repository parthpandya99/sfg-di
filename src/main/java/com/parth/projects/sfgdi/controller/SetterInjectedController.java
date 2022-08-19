package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingService;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:49
 * @project sfg-di
 **/
public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
