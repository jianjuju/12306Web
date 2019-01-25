package Circulation;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
     
		int count = 0;
     for(int i =1;i<=5;i++){
    	 System.out.println("请输入第"+i+"次成绩");
    	 
    	 double score = input.nextDouble();
    	 
    	 //如果分数score小于80，结束本次循环，不进行count++
    	 if(score<80){
    		 continue;
    	 }
       count++; //用于结束本次循环
    }
	    System.out.println("大于80的人数为："+count/5.0*100+"%");
	}

}
