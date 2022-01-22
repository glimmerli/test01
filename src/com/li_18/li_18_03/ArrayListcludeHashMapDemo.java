package com.li_18.li_18_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListcludeHashMapDemo {
    public static void main(String[] args) {


        //  创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();
        //创建HashMap集合，并添加元素

        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("孙策","大乔");
        hm1.put("周瑜","小乔");
        array.add(hm1);
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");
        array.add(hm2);
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳灵珊");
        array.add(hm3);

        //遍历   双层 一层一层遍历
        for(HashMap<String, String> hashM:array){
            Set<String> keySet = hashM.keySet();
            for(String key:keySet){
                String value = hashM.get(key);
                System.out.println(key+","+value);
            }

        }


    }

}
