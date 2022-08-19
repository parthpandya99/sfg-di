package com.parth.projects.sfgdi.controllers;

import com.parth.projects.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:49
 * @project sfg-di
 **/
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    @Qualifier("greetingServiceSetterImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
