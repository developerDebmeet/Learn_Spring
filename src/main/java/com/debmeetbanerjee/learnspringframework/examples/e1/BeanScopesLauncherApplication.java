package com.debmeetbanerjee.learnspringframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {

            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            /*
            com.debmeetbanerjee.learnspringframework.examples.e1.NormalClass@1b6e1eff
            com.debmeetbanerjee.learnspringframework.examples.e1.NormalClass@1b6e1eff
            com.debmeetbanerjee.learnspringframework.examples.e1.PrototypeClass@306f16f3
            com.debmeetbanerjee.learnspringframework.examples.e1.PrototypeClass@702b8b12
            com.debmeetbanerjee.learnspringframework.examples.e1.PrototypeClass@22e357dc
             */

        }

    }
}
/*
    All beans which are created by default are Singletons, that is the same instance of the bean is returned
    every time. If we want different instance of the bean to be created everytime it is referred to, we can use
    a Prototype Scope

    Some Special Scopes for web-aware Sprint ApplicationContext
    @Request : One object instance per single HTTP request
    @Session : One object instance per user HTTP Session
    @Application : One object instance per web application runtime
    @Websocket : One object instance per WebSocket instance

    Java Singleton [GOF, gang of four] vs Spring Singleton.
    The GOF Java Singleton is a design Pattern and is a little different from Spring's Singleton
    Spring Singleton : One object instance per Spring IOC container
    Java Singleton [GOF] : One object instance per JVM.

    IF there is a single spring IOC container running in a JVM, then both of them will mean the same thing
    but one JVM can have more than one Spring IOC Container. IN 99.99% scenarios, they mean the same thing

 */