package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import com.debmeetbanerjee.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.debmeetbanerjee.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
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