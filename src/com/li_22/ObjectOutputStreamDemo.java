package com.li_22;
/*
NotSerializableException抛出一个实例需要一个Serializable接口。 序列化运行时或实例的类可能会抛出此异常
interface Serializable类的序列化由实现java.io.Serializable接口的类启用。 不实现此接口的类将不会使任何状态序列化或反序列化。

 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//对象序列化
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\li\\project01\\oos.txt"));
        Student s = new Student("林青霞",30);
        oos.writeObject(s);


        oos.close();

    } //反序列化可以将序列化流读出来

}
