package Circulation;

import java.util.Scanner;

public class demon02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ѧ�����֣�");
		String name = input.nextLine();
		
		double sum = 0;
		for(int i= 1; i <6 ;i++){
			System.out.println("���������ſγ���"+i+"�ſγ̳ɼ���");
			double score = input.nextDouble();
			
			//sum=sum+score
			sum+=score;
		}
		System.out.println(name + "�ܳɼ�Ϊ��"+sum);
		System.out.println(name + "ƽ���ɼ�Ϊ��"+sum/5);

		
		
		System.out.println("������һ�����֣�");
		int number = input.nextInt();
		for(int i = 0,j = number ; i<=number ;i++,j--){
			System.out.println(i+" + "+j+" = "+(i+j));
		}
	}

}
