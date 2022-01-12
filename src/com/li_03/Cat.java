package com.li_03;

public class Cat extends Animal {
    @Override   //重写方法标识   重写正确不会报错
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
