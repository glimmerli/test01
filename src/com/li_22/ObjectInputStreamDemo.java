package com.li_22;
//对象反序列化可以将序列化流读出来
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\li\\project01\\oos.txt"));
        Object obj = ois.readObject();
        Student s=(Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();

    }
}
