package com.li_04;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建毛类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a =new Cat("加菲",6);
        System.out.println(a.getName()+"."+a.getAge());
        a.eat();
    }

}
