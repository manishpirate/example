package com.demo.example.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private OtherService otherService;

    @Autowired
    private ThirdService thirdService;

    @Autowired
    ApplicationContext context;

    @PostConstruct
    public void init(){
        otherService = context.getBean(OtherService.class);

    }


    public void display(){
        thirdService.displayMe();
        otherService.display();
    }
}
