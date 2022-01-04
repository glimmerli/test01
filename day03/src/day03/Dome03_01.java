package day03;

import java.util.Scanner;

public class Dome03_01 {
	public static void main(String[] args) {

//		定义一个People类,有name,height,weight三个属性,
//		有一个方法判断是否肥胖,启动程序录入3个学生的信息,
//		依次输入姓名,身高,体重,当输入完成后,
//		显示”xx同学,你的身材标准|偏胖|偏瘦,录入成功”,
//		当三个学生录入完成后将三个学生的所有属性打印到控制台
		People pe =new People();
		Scanner sc =new Scanner(System.in);
		
		if(int i=0;i<3;i++){
			System.out.println("请输入姓名：");
			String name =sc.next();
		
		
			System.out.println("请输入身高：");
			double hight =sc.nextDouble();
		
			System.out.println("请输入体重：");
			double weight =sc.nextDouble();
			System.out.println(name+"同学，您的身材" +pe.obesity());
		}	
		
	}	
}
