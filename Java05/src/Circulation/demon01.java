package Circulation;

import java.util.Scanner;

public class demon01 {

	public static void main(String[] args) {
	   //while ѭ��
		int i = 1;//i����һ����ͨ����������i�������ѭ�����棬����Խ���ѭ������
		while(i<=100){
			System.out.println("�ú�ѧϰ��������"+i);
			i++;//��ѭ�����������������������������ѭ��
		}
	   

		//do while
		Scanner input = new Scanner(System.in);
		
		boolean result = false;
		do{
			System.out.println("�ź������ϻ���ϰ");
			System.out.println("�ź��Ƿ�ϸ�");
			result = input.nextBoolean();
		}
		  while(!result);
		System.out.println("�ź�˳��ͨ�����");
		
		
		
	}

}
