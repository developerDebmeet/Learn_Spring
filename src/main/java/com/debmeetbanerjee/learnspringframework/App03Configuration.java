package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import com.debmeetbanerjee.learnspringframework.game.GamingConsole;
import com.debmeetbanerjee.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03Configuration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
