package com.parth.projects.sfgdi.controller;

import com.parth.projects.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        constructorInjectedController.getGreeting();
    }
}