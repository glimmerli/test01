package com.li_20.li_20_01;

import java.io.File;

public class DiGuiDemo {
    public static void main(String[] args) {

        File sceFile = new File("E:\\li");

        getAllFilePath(sceFile);
    }
    public static void getAllFilePath(File scrFile){

//        public File[] listFiles​(FilenameFilter filter)
// 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录
        File[] filesArray = scrFile.listFiles();
        //遍历该数组，得到每一个FIle对象
        if(filesArray!=null){
            for(File file:filesArray){
                //判断该File对象是否是目录 isDirectory​() 测试此抽象路径名表示的文件是否为目录。
                if(file.isDirectory()){
                    //是则递归调用
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
