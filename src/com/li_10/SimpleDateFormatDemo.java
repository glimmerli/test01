package com.li_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化  Date---到String
        Date d = new Date();
      //  SimpleDateFormat sdf = new SimpleDateFormat();   //使用电脑默认时间格式

       //重写时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String s=sdf.format(d);
        System.out.println(s);
        System.out.println("----------");
        //格式化String 到Date
         String ss="2022-1-19 20:07:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Date dd =sdf2.parse(ss);
        System.out.println(dd);

    }


}
