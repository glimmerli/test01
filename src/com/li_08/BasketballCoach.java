package com.li_08;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练如何运球和投球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }
}
