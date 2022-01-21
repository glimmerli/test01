package com.li_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        //获取元素所有键值对对象的集合  entrySet（）方法
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //增强for遍历键值对对象的集合，得到每一个键值对的对象
        for(Map.Entry<String, String> me:entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
