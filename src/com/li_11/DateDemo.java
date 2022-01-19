package com.li_11;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建对象
        Date d = new Date();
        String s1 =DateUtils.dateToString(d,"yyyy年MM月dd日");
        System.out.println(s1);

        String s="2022-1-19";
        Date s2 = DateUtils.stringToString(s,"yyyy-MM-dd");
        System.out.println(s2);
    }


}
