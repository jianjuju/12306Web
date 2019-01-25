package Circulation;
import java.util.Scanner;
public class zuoye {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      String answer;
	do{     
		    
		    System.out.println("请输入0到2之间的整数：");
			
		    int num = input.nextInt();
		    if(num<0||num>2){System.out.println("请输入正确的数字！");
		       return;}
    	    if(num==0){System.out.println("你出的是石头");}
    	    if(num==1){System.out.println("你出的是剪刀");}
    	    if(num==2){System.out.println("你出的是布");}
    	    
    	    System.out.println("是否要继续出拳？(n/y)");
    	    answer = input.next();
      } while(answer.equals("y"));
     
     System.out.println("结束！");
     
     System.out.println("----------------------------------------------------------------------------------------");
     
     int i1 =1;
     int sum =0;
     for(i1 = 1;i1<=100&&i1>=1;i1+=2){
    	 sum = i1+sum;
     }
     System.out.println("基数和为："+sum);
     
     int num =2;
     int sum2 =0;
    while(num<=100&&num>=2){
    	sum2 = sum2+num;
    	num+=2;
    }
     System.out.println("偶数和为："+sum2);
	
System.out.println("----------------------------------------------------------------------------------------------");
     
	 int j = 0;
     long result = 1;
     for ( j = 0; j <10; j++) {
         result *= (j + 1);
         System.out.println(result);
     }

     //hasNextInt():他能判断你下一个输入的数据类型，如果是指定类型就进入true。
	    if(input.hasNextInt()){
	    	int number = input.nextInt();
	    	System.out.println("你输入的是一个整数");
	    } else {System.out.println("你输入的不是一个整数");}
		
	
	}
	
	
	}


