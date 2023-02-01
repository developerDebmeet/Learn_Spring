package com.debmeetbanerjee.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
@Lazy // Class B's bean will not be created at startup. It will be created when actually required somewhere in code
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Some initialization Logic");
        this.classA = classA;
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Init of Context is done !!");

            context.getBean(ClassB.class); // Only when bean is used, then it is created due to lazy
            // @Lazy can be used in any class with @Component or any method with @Bean

            // Eager initialization is recommended since Errors in the configuration are discovered immediately
            // at application startup && will appear as runtime errors later on
            // Lazy-resolution proxy will be injected instead of actual dependency
            // Can be used on Configuration (@Configuration) class : all Bean methods within the Configuraiton class
            // Will be lazily initialized


        }

    }
}
