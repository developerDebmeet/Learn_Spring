package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import com.debmeetbanerjee.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
