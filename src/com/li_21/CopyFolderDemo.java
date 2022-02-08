package com.li_21;
/*
1. 创建数据源目录File对象，路径是E:\li\itcast
2.获取数据目录File对象的名称
3.创建目的地目录File对象，路径名是模块名+itcast组成
4.判断目的地目录对应的FIle是否存在，如果不存在，就创建
5.获取数据源目录下所有文件File数组
6.遍历File数组，得到每一个File对象，该File对象。就是数据源文件
7.获取数据源文件FIle对象的名称
8.创建目的地文件File对象路径名是模块名+    组成
9.复制文件
 */
import java.io.*;


//复制文件夹及内容
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //1.创建数据源目录File对象，路径是E:\li\itcast
        File srcFolder = new File("E:\\li\\itcast");
//        2.获取数据目录File对象的名称(itcast)
        String srcFolderName=srcFolder.getName();
//        3.创建目的地目录File对象，路径名是模块名+itcast组成()
        File destFolder = new File("E:\\li\\project01",srcFolderName);
//        4.判断目的地目录对应的FIle是否存在，如果不存在，就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
//        5.获取数据源目录下所有文件File数组
        File[] listFiles=srcFolder.listFiles();
//        6.遍历File数组，得到每一个File对象，该File对象。就是数据源文件
        for(File srcFile:listFiles){
//            7.获取数据源文件FIle对象的名称
            String srcFileName = srcFile.getName();
//            8.创建目的地文件File对象路径名是模块名+    组成
            File destFile = new File(destFolder, srcFileName);
//            9.复制文件
            copyFile(srcFile,destFile);

        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException{
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
