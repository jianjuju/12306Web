package Circulation;

import java.util.Scanner;

public class demon02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入学生名字：");
		String name = input.nextLine();
		
		double sum = 0;
		for(int i= 1; i <6 ;i++){
			System.out.println("请输入五门课程中"+i+"门课程成绩：");
			double score = input.nextDouble();
			
			//sum=sum+score
			sum+=score;
		}
		System.out.println(name + "总成绩为："+sum);
		System.out.println(name + "平均成绩为："+sum/5);

		
		
		System.out.println("请输入一个数字：");
		int number = input.nextInt();
		for(int i = 0,j = number ; i<=number ;i++,j--){
			System.out.println(i+" + "+j+" = "+(i+j));
		}
	}

}
