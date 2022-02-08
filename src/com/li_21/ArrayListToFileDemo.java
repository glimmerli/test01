package com.li_21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("it001","吕树",16,"洛阳");
        Student s2 = new Student("it002","吕小树",12,"洛阳");

        array.add(s1);
        array.add(s2);
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\li\\project01\\name01.txt"));
        for(Student s:array){
            //把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
