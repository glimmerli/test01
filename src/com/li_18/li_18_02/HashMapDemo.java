package com.li_18.li_18_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();
        Student s1 = new Student("杨过", 18);
        Student s2 = new Student("小龙女", 28);
        Student s3 = new Student("龙女", 18);
        hm.put("heima001",s1);
        hm.put("heima002",s2);
        hm.put("heima003",s3);


        // 1.获取所有键的集合，用keySet()方法实现
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            //根据键去找值，用get（object key）实现
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        System.out.println("---------------------------");
        //获取元素所有键值对对象的集合  entrySet（）方法

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();


        for(Map.Entry<String, Student> me:entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+"，"+value.getAge());
        }

    }
}
