package com.li_20.li_20_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\li\\mm.jpg");

        FileOutputStream fos = new FileOutputStream("E:\\li\\project01\\mm.jpg");

        byte [] bys =new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);

        }
        fis.close();
        fos.close();


    }
}
