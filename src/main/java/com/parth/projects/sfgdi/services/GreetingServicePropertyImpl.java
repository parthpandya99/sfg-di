package com.parth.projects.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 18:41
 * @project sfg-di
 **/
@Service
public class GreetingServicePropertyImpl implements GreetingService {
    /**
     * @return
     */
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
