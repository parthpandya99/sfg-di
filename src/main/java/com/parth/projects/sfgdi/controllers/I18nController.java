package com.parth.projects.sfgdi.controllers;

import com.parth.projects.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 19:42
 * @project sfg-di
 **/
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
