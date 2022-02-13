package com.li_22;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private GuessNumber() {

    }

    public static void statr() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数字大了");

            } else if (guessNumber < number) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("你猜中了" + number);
                break;
            }

        }

    }
}