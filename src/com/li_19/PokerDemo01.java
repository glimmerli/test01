package com.li_19;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo01 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();
        //牌盒装牌
    /*
        ♣
        ♦
        ♥
        ♠
        大王
        小王
     */
        //创建花色数组
        String[] colors = {"♣", "♦", "♥", "♠"};
        ///创建点数数组
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String num : number) {
                array.add(color + num);
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);
        //发牌
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        ArrayList<String> arraydp = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                arraydp.add(poker);
            } else if (i % 3 == 0) {
                array1.add(poker);
            } else if (i % 3 == 1) {
                array2.add(poker);
            } else if (i % 3 == 2) {
                array3.add(poker);
            }
        }
        LookPoker("林青霞",array1);
        LookPoker("风清扬",array2);
        LookPoker("小龙女",array3);
        LookPoker("底牌",arraydp);

    }

//看牌



//        看牌方法
        public static void LookPoker(String name,ArrayList<String> array){
            System.out.println(name+"底牌是:");
            for(String Poker:array) {
                System.out.print(Poker + ",");
            }
            System.out.println();
            }
        }





