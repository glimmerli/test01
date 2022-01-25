package com.li_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo02 {
    public static void main(String[] args) {
//        创建牌盒
        HashMap<Integer,String> hm=new HashMap<Integer, String>();

        //编号
        ArrayList<Integer> array=new ArrayList<Integer>();
        //创建花色数组
        String[] colors ={"♥","♣","♠","♦"};
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=0;
        for(String number:numbers){
            for (String color:colors){
            hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

//        洗牌
        Collections.shuffle(array);
//        发牌 有序 TreeSet
        TreeSet<Integer> arrayx=new TreeSet<Integer>();
        TreeSet<Integer> arrayy=new TreeSet<Integer>();
        TreeSet<Integer> arrayz=new TreeSet<Integer>();
        TreeSet<Integer> arraydp=new TreeSet<Integer>();

        for (int i=0;i<array.size();i++){
            int x=array.get(i);
            if(i>=array.size()-3){
                arraydp.add(x);
            }else if(i%3==0){
                arrayx.add(x);
            }else if(i%3==1){
                arrayy.add(x);
            }else if (i%3==2){
                arrayz.add(x);
            }
        }
        lookPoker("s1",arrayx,hm);
        lookPoker("s2",arrayy,hm);
        lookPoker("s3",arrayz,hm);
        lookPoker("dp",arraydp,hm);


    }



//看牌方法(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是：");
        for(Integer key:ts){
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
