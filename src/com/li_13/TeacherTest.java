package com.li_13;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        }catch (ScoreException e){
            e.printStackTrace();
        }
    }

}
