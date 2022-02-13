package com.li_22;
//Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。
//属性列表中的每个键及其对应的值都是一个字符串。


import java.io.*;
import java.util.Properties;

/*
        void load​(Reader reader) 以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。
        void store​(Writer writer, String comments) 将此属性列表（键和元素对）写入此 Properties表中，
        以适合使用 load(Reader)方法的格式输出到输出字符流。

         */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        myStore();
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
//        void load​(Reader reader)
        FileReader fr = new FileReader("E:\\li\\project01\\fw.txt");
        prop.load(fr);
        fr.close();
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("it001","lin");
        prop.setProperty("it002","li");
        prop.setProperty("it003","l");
//        void store​(Writer writer, String comments)
        FileWriter fw = new FileWriter("E:\\li\\project01\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
