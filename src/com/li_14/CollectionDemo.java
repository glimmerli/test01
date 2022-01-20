package com.li_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c =new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("王五", 15);
        Student s2 = new Student("王五", 15);
        Student s3 = new Student("王六", 18);
        //把学生添加到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //遍历集合（迭代器方式）
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
