package com.li_03;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象  调用方法
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);  //将 Cat c = new Cat(); 调用到Animal a=new Cat();

        Dog d=new Dog();
        ao.useAnimal(d);

    }
}
