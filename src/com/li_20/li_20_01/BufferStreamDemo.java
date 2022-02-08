package com.li_20.li_20_01;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
////        FileOutputStream fos = new FileOutputStream("");
////        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\li\\project01\\bos.txt"));
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
        //读数据
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\li\\project01\\bos.txt"));

        int by;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }



//        bos.close();
        bis.close();
    }
}
