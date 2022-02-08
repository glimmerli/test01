package com.li_20.li_20_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("E:\\li\\project01\\fos.txt");
//        } catch (FileNotFoundException e) {
//             e.printStackTrace();
//        }finally {
//            fos.close();
//        }
//创建直接输入流对象FileInputStream
       FileInputStream fis = new FileInputStream("E:\\li\\project01\\fos.txt");

//        read​(byte[] b)
// 从输入流中读取一些字节数，并将它们存储到缓冲器阵列 b 。


//        abstract int read​() 从输入流读取数据的下一个字节。
        //读第一个数据
   /*     int by= fis.read();
       System.out.println(by);//97
        System.out.println((char)by);//a
        //读第二个数据
         by= fis.read();
        System.out.println(by);//98
        System.out.println((char)by);//b
        System.out.println("------------");

     */
        //循环
       /*int by=fis.read();
       while(by!=-1){
           System.out.print((char)by);
           by=fis.read();
       }
       */
//       优化循环
        /*
        fis.read( ); 读数据
        by=fis.read(); 把读取到的数据赋值给by
        by!=-1; 判断读取到的数据是否是-1
         */
        int by;
        while((by=fis.read())!=-1){
            System.out.print((char)by);
        }


//        释放资源
        fis.close();

    }
}
