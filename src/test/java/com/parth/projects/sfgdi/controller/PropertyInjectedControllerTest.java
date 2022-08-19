package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:44
 * @project sfg-di
 **/
class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        //Mimicking what spring does for us
        // This is essentially DI without the help of the spring framework
        // This is property based DI
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService  = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        propertyInjectedController.getGreeting();
    }
}