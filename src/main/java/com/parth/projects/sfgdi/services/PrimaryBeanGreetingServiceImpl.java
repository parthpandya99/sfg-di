package com.parth.projects.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 19:28
 * @project sfg-di
 **/
@Service
@Primary
public class PrimaryBeanGreetingServiceImpl implements GreetingService {
    /**
     * @return
     */
    @Override
    public String sayGreeting() {
       return "Hello world - Primary bean";
    }
}
