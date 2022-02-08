package com.li_21;
//额外需求成绩由高到低排序
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


/*
    1.定义学生类
    2.创建TreeSet集合，通过比较器排序进行排序
    3.键盘录入学生数据
    4.创建学生队形，把键盘录入的数据对应赋值给学生对象的成员变量
    5.把学生对象添加到TreeSet集合
    6.创建字符缓冲输出流对象
    7.遍历集合得到每一个学生对象
    8.把学生对象的数据拼接成自动格式的字符串
    9.调用字符缓冲输出流对象的方法写数据
    10.释放资源

 */


public class ArrayListToFileDemo02 {
    public static void main(String[] args) throws IOException {
        //Treeset集合 比较器排序
        TreeSet<Students> ts = new TreeSet<Students>(new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                int sum=s2.getSum()-s1.getSum();//    成绩总分从高到低排序
                int sum2=sum==0?s1.getChinese()-s2.getChinese():sum;
                int sum3=sum2==0?s1.getMath()-s2.getMath():sum2;
                int sum4=sum3==0?s1.getName().compareTo(s2.getName()):sum3;
                return sum4;
            }
        });//匿名内部类
//        3.键盘录入学生数据
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"学生信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();
//            4.创建学生队形，把键盘录入的数据对应赋值给学生对象的成员变量
            Students s = new Students();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
//            5.把学生对象添加到TreeSet集合
            ts.add(s);
//            6.创建字符缓冲输出流对象
            BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\li\\project01\\score.txt"));
//            7.遍历集合得到每一个学生对象
                for(Students S:ts){
//             8.把学生对象的数据拼接成自动格式的字符串
                    StringBuffer sb = new StringBuffer();
                    sb.append(S.getName()).append(",").append(S.getChinese()).append(",").append(S.getMath()).append(",").append(S.getEnglish());
//              9.调用字符缓冲输出流对象的方法写数据
                    bw.write(sb.toString());
                    bw.newLine();
                    bw.flush();
                }
//              10.释放资源
                bw.close();
        }



    }




}
