package com.debmeetbanerjee.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Enter a Hole");
    }
    public void left() {
        System.out.println("Go Back");
    }
    public void right() {
        System.out.println("Go Ahead");
    }

}
