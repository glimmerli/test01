package com.li_18.li_18_05;
/*
    Collections类
void sort​(List<T> list) 根据其元素的natural ordering按照升序排列指定的列表。
static void reverse​(List<?> list) 反转指定列表中元素的顺序。
static void shuffle​(List<?> list) 使用默认的随机源随机排列指定的列表。
*/

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(40);
        list.add(60);
        list.add(10);
        // Collections.sort(list);
//        Collections.reverse(list);
            Collections.shuffle(list);
        System.out.println(list);
    }

}
