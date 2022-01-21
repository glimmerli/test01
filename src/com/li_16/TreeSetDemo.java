package com.li_16;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //这里用的是比较器排序Comparator
        // li_15用的是自然排序Comparable
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s2.getSum()-s1.getSum();
                     int num2=num==0?s1.getChinese()-s2.getChinese():num;
                    int num3=num2==0?s1.getName().compareTo(s2.getName()):num2;
                     return num3;
            }
        });

        Student s1 = new Student("貂蝉", 96, 80);
        Student s2 = new Student("王昭君", 97, 89);
        Student s3 = new Student("西施", 98, 85);
        Student s4 = new Student("杨玉环", 96, 80);
        Student s5 = new Student("杨玉", 96, 80);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+"总分："+s.getSum());
        }
    }
}
