package com.li_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象 存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();
        while(true){
        //1 主界面编写
        System.out.println("欢迎来到学生管理系统");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择");
        //2 键盘输入
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //3 循环语句实现选择

        switch(line){
            case "1" :
                addStudent(array);
                //System.out.println("添加学生");
                break ;
            case "2" :
                delectStudent(array);
                //System.out.println("删除学生");
            case "3" :
                updateStudent(array);
                //System.out.println("修改学生");
                break ;
                case "4" :
                findStudent(array);
                //System.out.println("查看学生");
                break ;
                case "5" :
                    System.out.println("谢谢使用");
                System.exit(0);// JVM  Java虚拟机退出
            }
        }
    }
    //添加学生的方法  返回值类型  void   集合是一种引用类型 参数ArrayList<Student>
    public static void addStudent(ArrayList<Student> array){
         //键盘键入 学生对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.nextLine();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入居住地：");
        String address = sc.nextLine();
        //创建学生对象   将数据赋值给成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        System.out.println("添加成功");
    }
    //删除学生   返回值类型   void  参数ArrayList<Student>
    public static  void delectStudent(ArrayList<Student> array){
        //提示需要删除的学号
        Scanner sc = new Scanner(System.in);
        System.out.println("需要删除的学号:");
        String sid = sc.nextLine();

        //遍历集合将对应学生删除
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                array.remove(i);
                System.out.println("删除学生信息成功");

                break;  // 结束循环
            }else{
                System.out.println("输入的学号有误请");
                }
            }
        }
    //修改学生的方法   返回值类型   void  参数ArrayList<Student>
    public static void updateStudent(ArrayList<Student> array){
        //键入修改的学号
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要修改的学生学号");
        String sid = sc.nextLine();
        System.out.println("输入需要修改的学生姓名");
        String name = sc.nextLine();
        System.out.println("输入需要修改的学生年龄");
        String age = sc.nextLine();
        System.out.println("输入需要修改的学生居住地");
        String address = sc.nextLine();
        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //循环修改学生信息
        for(int i=0;i<array.size();i++){
            Student x = array.get(i);
            if(x.getSid().equals(sid)){
                array.set(i,s);
                break;


            }
        }


    }
    //查看学生的方法   返回值类型   void  参数ArrayList<Student>
    public static void findStudent(ArrayList<Student> array){
        // 显示表头信息
        //System.out.println("学号\t姓名\t年龄\t居住地");
        //遍历集合
        if(array.size()==0){
            System.out.println("无信息，请添加信息");
            return;  //  不再往下执行   或者加else
        }
        for(int i=0;i<array.size();i++){
            //获取元素
            Student s = array.get(i);
            System.out.println("学号："+s.getSid()+"姓名："+s.getName()+"年龄："+s.getAge()+"居住地："+s.getAddress());

        }
    }
}
