package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.*;
import com.debmeetbanerjee.learnspringframework.helloworld.App03Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App03Configuration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
