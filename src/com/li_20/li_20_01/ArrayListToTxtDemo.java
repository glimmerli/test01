package com.li_20.li_20_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\li\\project01\\arr.txt"));
        //遍历
         for(String s:arr){
             bw.write(s);
             bw.newLine();
             bw.flush();
         }
         //释放资源
        bw.close();
    }
}
