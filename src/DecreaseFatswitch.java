import java.util.Scanner;

public class DecreaseFatswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入星期数：");
        int week =sc.nextInt();
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("骑车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好吃一顿，一周白干");
                break;
                default:
                    System.out.println("你输入的星期数不对");







        }
    }
}
