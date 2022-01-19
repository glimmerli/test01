package com.li_12;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //输入任意年份
        Scanner sc = new Scanner(System.in);
        System.out.println("输入任意年份：");
        int year = sc.nextInt();

        //设置日历对象的年，月，日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);   //月份从0开始的 所以三月应该设置为2
        //3月1日往前推一天就是二月最后一天
        c.add(Calendar.DATE,-1);
        //获取这一天输出
        int date = c.get(Calendar.DATE);
        System.out.println("二月天"+date);

    }
}
