package com.li_09;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {

        //定义一个字符串
        String s="91,27,46,38,50";
        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(",");
//        for(int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//        }
    //定义一个int数组，将String[] 数组中的每一个元素存储到int数组中
       //长度为strArray.length
        int [] arr =new int[strArray.length];
        for(int i=0;i<arr.length;i++){
        arr[i]=Integer.parseInt(strArray[i]); //类型转换
        }

//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i]);
//    }
        //对数组排序
        Arrays.sort(arr);
        //拼接字符串 ","   采用StringBuilder 字符串生成器实现
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){   //如果为最后一个不需要拼接","
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }

        String result = sb.toString();
        System.out.println("result:"+result);

    }
}
