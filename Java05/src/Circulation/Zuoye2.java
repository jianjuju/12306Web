package Circulation;
import java.util.Scanner;
public class Zuoye2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
     
		String answer;
		do{
			System.out.println("ÀÏÆÅÄã°®ÎÒÂð£¿");
			answer = input.next();
			if(answer.equals("°®")){				
			                             }
		}
          while(answer.equals("²»°®"));
			
		System.out.println("Ì«ÓÍÄåÀ²£¬ÊÜ²»ÁË");
		
System.out.println("----------------------------------------------------------------------------------------------");


    int day;
	do{
		System.out.println("ÇëÊäÈëÒ»¸öÊý×Ö£º");
		 day = input.nextInt();
    	 switch(day){
    	 case 1:
    		 System.out.println("Àñ°ÝÒ»");
    		 break;
    	 case 2:
    		 System.out.println("Àñ°Ý¶þ");
    		 break;
    	 case 3:
    		 System.out.println("Àñ°ÝÈý");
    		 break;
    	 case 4:
    		 System.out.println("Àñ°ÝËÄ");
    		 break;
    	 case 5:
    		 System.out.println("Àñ°ÝÎå");
    		 break;
    	 case 6:
    		 System.out.println("Àñ°ÝÁù");
    		 break;
    	 case 7:
    		 System.out.println("Àñ°ÝÌì");
    		 break;
    	 case 0:
    		 System.out.println("½áÊø");
    		 break;
          default:System.out.println("ÇëÖØÐÂÊäÈëÊý×Ö");
    	
    }
	}
	while(day>0);


System.out.println("----------------------------------------------------------------------------------------");


    for(int a = 1;a<=8;a++){
    	for(int b =8;b>=a;b--){
    		System.out.print(" ");
    	}
    	for(int b=1;b<=a*2-1;b++){
    		   		System.out.print(a);
    	}
    System.out.println();
    }

	
	}

}
