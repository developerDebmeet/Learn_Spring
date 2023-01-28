package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.GameRunner;
import com.debmeetbanerjee.learnspringframework.game.MarioGame;
import com.debmeetbanerjee.learnspringframework.game.SuperContraGame;
import com.debmeetbanerjee.learnspringframework.game.GamingConsole;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();

        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
