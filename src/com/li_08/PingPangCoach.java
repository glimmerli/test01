package com.li_08;

public class PingPangCoach extends Coach {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教球");

    }

    @Override
    public void eat() {
        System.out.println("pingpangqiu教练吃饭");
    }
}
