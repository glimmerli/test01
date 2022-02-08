package com.li_20.li_20_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("E:\\li\\文本.txt");
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\li\\project01\\文本.txt");
        //读数据
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
