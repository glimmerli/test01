package day03;

import java.util.Scanner;

public class Dome03_01 {
	public static void main(String[] args) {

//		����һ��People��,��name,height,weight��������,
//		��һ�������ж��Ƿ����,��������¼��3��ѧ������Ϣ,
//		������������,���,����,��������ɺ�,
//		��ʾ��xxͬѧ,�����ı�׼|ƫ��|ƫ��,¼��ɹ���,
//		������ѧ��¼����ɺ�����ѧ�����������Դ�ӡ������̨
		People pe =new People();
		Scanner sc =new Scanner(System.in);
		
		if(int i=0;i<3;i++){
			System.out.println("������������");
			String name =sc.next();
		
		
			System.out.println("��������ߣ�");
			double hight =sc.nextDouble();
		
			System.out.println("���������أ�");
			double weight =sc.nextDouble();
			System.out.println(name+"ͬѧ���������" +pe.obesity());
		}	
		
	}	
}
