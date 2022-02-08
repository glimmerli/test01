package com.li_20.li_20_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("E:\\li\\project01\\name.txt"));
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();
        //调用字符缓冲输入流对象的方法读数据
        String line;
        while((line=br.readLine())!=null){
         array.add(line);

        }
        //把读到的字符串数据存到集合中

        //释放资源
        br.close();
        //使用Random产生一个随机数
        Random ran = new Random();
        int index = ran.nextInt(array.size());
        //随机数为ArrayList集合中获取值
        String name = array.get(index);
        //输出到控制台
        System.out.println("幸运者是:"+name);



    }
}
