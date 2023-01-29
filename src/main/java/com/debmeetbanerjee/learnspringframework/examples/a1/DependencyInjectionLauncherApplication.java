package com.debmeetbanerjee.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {

    @Autowired
    Dependency1 dependency1; // this is Field injection. There is no Setter or Constructor present

    @Autowired
    Dependency2 dependency2;

    Dependency3 dependency3;

    @Autowired // Setter Injection
    public void setDependency3(Dependency3 dependency3) {
        System.out.println("Using Setter-------------");
        this.dependency3 = dependency3;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2 + " and " + dependency3;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2{

}

@Component
class Dependency3{
    Dependency2 dependency2;

//    @Autowired // Constructor Injection -----> Special thing in Constructor injection is that, Autowired Annotation is not necessary, spring autowires it anyway
    // Constructor based injection is recommended by Spring team since all init can happen via a single method.
    Dependency3 (Dependency2 dependency2) {
        System.out.println(dependency2);
        System.out.println("Dependency 2 injected via Constructor");
        this.dependency2 = dependency2;
    }
}

@Configuration
@ComponentScan
//@ComponentScan("com.debmeetbanerjee.learnspringframework.examples.a1") --> If you want to perform ComponentScan on the
//same file as the code, no need to mention package, just @ComponentScan is enough
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class)); // this is same as printing the object, the toString() will be called.
            System.out.println(context.getBean(Dependency3.class));
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