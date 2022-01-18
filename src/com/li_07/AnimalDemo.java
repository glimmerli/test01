package com.li_07;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        jumping j=new Cat();
        j.jump();
        System.out.println("----------");

        Animal a =new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        ((Cat) a).jump();
    }

}
