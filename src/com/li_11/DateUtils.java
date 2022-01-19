package com.li_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//时间工具类
public class DateUtils {
        //构造方法私有  成员方法静态
    private DateUtils(){}

    /*

    把日期转换成指定格式的字符串
    返回值类型String
    参数Date date，String format

     */
    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    /*
    返回值类型 Date
    参数 String s, String format
     */
    public static Date stringToString(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d =sdf.parse(s);
        return d;
    }
}
