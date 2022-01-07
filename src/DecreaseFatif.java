import java.util.Scanner;

public class DecreaseFatif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("输入星期数");
        int week =sc.nextInt();
        if(week<1||week>7){
            System.out.println("你输入的星期数有误");
        }else if(week==1){
            System.out.println("跑步");
        }else if(week==2){
            System.out.println("游泳");
        }else if(week==3){
            System.out.println("慢走");
        }else if(week==4){
            System.out.println("骑车");
        }else if(week==5){
            System.out.println("拳击");
        }else if(week==6){
            System.out.println("爬山");
        }else{
            System.out.println("好吃一顿，一周白干");
        }


    }
}
