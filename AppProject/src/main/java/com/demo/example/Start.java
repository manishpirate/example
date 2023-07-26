package com.demo.example;

import com.demo.example.services.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        System.out.println("Program Started");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService service = context.getBean(TestService.class);
        service.display();
        System.out.println("All calling done");
    }
}
