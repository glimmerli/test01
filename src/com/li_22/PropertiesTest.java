package com.li_22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public  class PropertiesTest  {
    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();
        FileReader fr = new FileReader("E:\\li\\project01\\game.txt");
        prop.load(fr);
        fr.close();


        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        if(number>3){
            System.out.println("游戏试玩结束，请充值");
        }else{
            GuessNumber.statr();
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("E:\\li\\project01\\game.txt");
            prop.store(fw,null);
            fw.close();
        }

    }
}
