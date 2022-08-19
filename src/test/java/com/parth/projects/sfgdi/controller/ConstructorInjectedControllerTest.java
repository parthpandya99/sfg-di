package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingServiceConstructorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:53
 * @project sfg-di
 **/
class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceConstructorImpl());
    }

    @Test
    void getGreeting() {
        constructorInjectedController.getGreeting();
    }
}