package com.debmeetbanerjee.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
//@ComponentScan("com.debmeetbanerjee.learnspringframework.examples.a1") --> If you want to perform ComponentScan on the
//same file as the code, no need to mention package, just @ComponentScan is enough
public class SimpleSpringContextLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}
/*
* @Primary - A bean will get preference when multiple qualifying beans are present
* @Qualifier - A specific bean should get autowired [bean name can be used as qualifier]
* Always think from the perspective of the clas which is using the dependencies
*
* If only @Autowired is present : Give me a preferred qualifying bean
* If @Autowired and @Qualifier present : Give me that specific bean
*
* @Qualifier has higher priority than @Primary
* */