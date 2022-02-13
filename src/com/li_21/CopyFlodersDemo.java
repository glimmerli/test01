package com.li_21;

import java.io.*;

public class CopyFlodersDemo {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("E:\\li\\itcast");
        File destFile = new File("E:\\li\\project01");
        //创建实现文件夹复制
        copyFloder(srcFile,destFile);

    }
    //文件夹复制的方法
    private static void copyFloder(File srcFile, File destFile)throws IOException {
       //是否是目录
        if(srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
//            File​(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
            File newFolder = new File(destFile, srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
//            获取数据源目录下所有文件File数组
            File[] fileArray = srcFile.listFiles();
            //遍历
            for(File file:fileArray){
                copyFloder(file,newFolder);//递归调用
            }
        }else {
            //说明是文件，直接复制，用字节流
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile,newFile);
        }

    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys=new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
