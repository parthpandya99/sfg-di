package com.parth.projects.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Parth Pandya
 * @date 19-08-2022
 * @time 19:43
 * @project sfg-di
 **/
@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService{
    /**
     * @return
     */
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
