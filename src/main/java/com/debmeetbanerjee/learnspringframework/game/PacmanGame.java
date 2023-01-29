package com.debmeetbanerjee.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Instance of Packman Game will be made by Spring automatically
@Primary
public class PacmanGame implements GamingConsole{

    public void up() {
        System.out.println("^");
    }
    public void down() {
        System.out.println("v");
    }
    public void left() {
        System.out.println("<");
    }
    public void right() {
        System.out.println(">");
    }

}
