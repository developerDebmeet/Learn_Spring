package com.debmeetbanerjee.learnspringframework.examples.h1;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@Configuration// This @Configuration is used for indicating Java Configuration.
//@ComponentScan
public class XMLConfigurationContextLauncherApplication {

    public static void main(String[] args) {

//        try (var context = new AnnotationConfigApplicationContext(XMLConfigurationContextLauncherApplication.class)) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
//        }

        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
             Arrays.stream(context.getBeanDefinitionNames())
                     .forEach(System.out::println);

             System.out.println(context.getBean("name"));
             System.out.println(context.getBean("age"));

             context.getBean(GameRunner.class).run();
        }

    }

}