package com.parth.projects.sfgdi.controllers;

import com.parth.projects.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:52
 * @project sfg-di
 **/
@Controller
public class ConstructorInjectedController {
    //@Autowired annotation is not required for constructor based DI
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceConstructorImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
