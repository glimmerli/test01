package com.li_21;

import java.io.*;

public class CopyjavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\li\\project01\\src\\com\\li_21\\CopyFlodersDemo.java"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\li\\project01\\src\\com\\li_21\\Copy.java"));
//        String line;
//        while((line=br.readLine())!=null){
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//        br.close();
//        bw.close();
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\\\li\\\\project01\\\\src\\\\com\\\\li_21\\\\Copy.java"), true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }

}
