package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.starter.CustomProperties;

@Component
public class DemoApplicationRunner implements CommandLineRunner {

//    private final CustomProperties customProperties;
//
//
//    public DemoApplicationRunner(CustomProperties customProperties) {
//        this.customProperties = customProperties;
//    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println("Custom Message: " + customProperties.getMessage());
    }
}