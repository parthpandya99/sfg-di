package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:51
 * @project sfg-di
 **/
class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        //This is setter based DI
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceConstructorImpl());
    }

    @Test
    void getGreeting() {
        setterInjectedController.getGreeting();
    }
}