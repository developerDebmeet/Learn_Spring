package com.debmeetbanerjee.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        // Launch a Spring Context
        // Try with resources, to close the context later on.
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // Configure the things that we want Spring to manage - @Configuration
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            // Retrieving Beans managed by Spring;
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("address"));
            System.out.println(context.getBean("adrs"));  // getting bean using bean name
            System.out.println(context.getBean(Address.class)); // getting bean using bean address
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person4Parameters"));
            System.out.println(context.getBean("person5Qualifier"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // Get all bean names, which are managed by spring


        }

    }
}
