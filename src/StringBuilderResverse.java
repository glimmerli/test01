import java.util.Scanner;

public class StringBuilderResverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("输入一行字符串：");
        // 输入一行字符串
        String line = sc.nextLine();
        //调用 Reverse 方法
        String s = Reverse(line);
        //输出结果
        System.out.println(s);
    }
    public static String Reverse(String s){
       /* StringBuilder sb = new StringBuilder(s);
        StringBuilder re = sb.reverse();
        String ss =re.toString();
        */return new StringBuilder(s).reverse().toString();
    }



}
