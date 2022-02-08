package com.li_20.li_20_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //缓存输入流
        BufferedReader br = new BufferedReader(new FileReader("E:\\li\\project01\\arr.txt"));
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        String line;
        while((line=br.readLine())!=null){
            //把读取到的字符存储到集合中
            array.add(line);
        }
        br.close();
        //遍历集合
        for(String s:array){
            System.out.println(s);
        }
    }
}
