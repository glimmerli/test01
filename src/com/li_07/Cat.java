package com.li_07;

public class Cat extends Animal implements jumping{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void jump() {

        System.out.println("猫tiao高");
    }
    public void eat(){
        System.out.println("猫吃鱼");
  }
}
