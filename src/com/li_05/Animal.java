package com.li_05;
//抽象类
public abstract class Animal {   //抽象类中可以有抽象方法 但是抽象方法不能没有抽象类
//抽象方法
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }
}
