package com.li_18.li_18_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//需求创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的是String，值是ArrayList
//每一个ArrayList的元素是String，并遍历
public class HashMapcludeArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("诸葛亮");
        s1.add("赵云");
        hm.put("三国演义",s1);
        ArrayList<String> s2 = new ArrayList<>();
        s2.add("唐僧");
        s2.add("孙悟空");
        hm.put("西游记",s2);
        ArrayList<String> s3 = new ArrayList<>();
        s3.add("武松");
        s3.add("鲁智深");
        hm.put("水浒传",s3);
        //遍历
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for(String s:value){
                System.out.println("\t"+s);
            }

        }
    }
}
