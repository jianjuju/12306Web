package Circulation;

import java.util.Scanner;

public class demo03 {

	private static Object input;

	public static void main(String[] args) {
     int i =0;
     int sum = 0;
     
     for(i = 0; i<=100; i+=2 ){
    	 sum = sum+i;
     }
     System.out.println("�ܺ�Ϊ��"+sum);
    

   Scanner input = new Scanner(System.in);

    System.out.println("������һ��������");
	int number =  input.nextInt();
	
	int num = 0;
	
	while(number !=0){
		num = number%10;
		System.out.println(num);
		number = number/10;
	}
     
	

		
	}
}