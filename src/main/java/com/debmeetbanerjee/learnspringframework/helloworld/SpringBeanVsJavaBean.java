package com.debmeetbanerjee.learnspringframework.helloworld;

import java.io.Serializable;

class Pojo {
    private String text;
    private int number;
    public String toString() {
        return text + " : " + number;
    }
}

// Conditions : implements Serializable,
// has a no args contructor
// has getters and setters
class JavaBean implements Serializable { // EJB : Enterprise Java Bean
    public JavaBean() {

    }
    private String text;
    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class SpringBeanVsJavaBean {
}
