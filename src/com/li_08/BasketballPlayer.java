package com.li_08;

public class BasketballPlayer extends Player implements SpeakEnglish {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭 ");
    }

    @Override
    public void speak() {
        System.out.println("篮球运动员说英语");
    }
}
