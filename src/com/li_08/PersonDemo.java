package com.li_08;
//测试类
public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer pp = new PingPangPlayer();
        pp.setName("王浩");
        pp.setAge(18);
        System.out.println(pp.getName()+","+pp.getAge());
        pp.eat();
        pp.study();
        pp.speak();
    }
}
