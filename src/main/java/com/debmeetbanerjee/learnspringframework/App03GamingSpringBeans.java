package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import com.debmeetbanerjee.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App03Configuration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
