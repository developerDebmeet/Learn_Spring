package com.debmeetbanerjee.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("all dependencies are ready!!!!!");
    }

    @PostConstruct
    // As soon as all the dependencies are wired in, we would want to do some initialization
    public void initialize() {
        someDependency.getReady();
        // all this will happen before any bean of this class is created
    }

    // We may want to do something before app is terminated
    // Or Bean is removed from context
    @PreDestroy
    public void cleanUp(){
        System.out.println("Close DB connections etc..............");
        // Typically used to release resources
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some Logic");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }

    }
}
