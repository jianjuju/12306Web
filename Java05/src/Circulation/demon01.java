package Circulation;

import java.util.Scanner;

public class demon01 {

	public static void main(String[] args) {
	   //while 循环
		int i = 1;//i就是一个普通变量，但是i如果用在循环里面，你可以叫他循环变量
		while(i<=100){
			System.out.println("好好学习天天向上"+i);
			i++;//让循环变量自增，如果不自增，就是死循环
		}
	   

		//do while
		Scanner input = new Scanner(System.in);
		
		boolean result = false;
		do{
			System.out.println("张浩在做上机练习");
			System.out.println("张浩是否合格？");
			result = input.nextBoolean();
		}
		  while(!result);
		System.out.println("张浩顺利通过检查");
		
		
		
	}

}
