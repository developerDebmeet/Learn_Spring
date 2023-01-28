package com.debmeetbanerjee.learnspringframework;

import com.debmeetbanerjee.learnspringframework.game.*;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        //var superContraGame = new SuperContraGame();

        var game = new PacmanGame();            // Object Creation
        var gameRunner = new GameRunner(game);  // Object Creation + Wiring of Dependencies
                                                // Game is a dependency of GameRunner
        gameRunner.run();

    }
}