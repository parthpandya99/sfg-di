package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingService;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:43
 * @project sfg-di
 **/
public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
