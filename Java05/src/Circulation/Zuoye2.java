package Circulation;
import java.util.Scanner;
public class Zuoye2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
     
		String answer;
		do{
			System.out.println("�����㰮����");
			answer = input.next();
			if(answer.equals("��")){				
			                             }
		}
          while(answer.equals("����"));
			
		System.out.println("̫���������ܲ���");
		
System.out.println("----------------------------------------------------------------------------------------------");


    int day;
	do{
		System.out.println("������һ�����֣�");
		 day = input.nextInt();
    	 switch(day){
    	 case 1:
    		 System.out.println("���һ");
    		 break;
    	 case 2:
    		 System.out.println("��ݶ�");
    		 break;
    	 case 3:
    		 System.out.println("�����");
    		 break;
    	 case 4:
    		 System.out.println("�����");
    		 break;
    	 case 5:
    		 System.out.println("�����");
    		 break;
    	 case 6:
    		 System.out.println("�����");
    		 break;
    	 case 7:
    		 System.out.println("�����");
    		 break;
    	 case 0:
    		 System.out.println("����");
    		 break;
          default:System.out.println("��������������");
    	
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
