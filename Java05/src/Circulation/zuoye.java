package Circulation;
import java.util.Scanner;
public class zuoye {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
      String answer;
	do{     
		    
		    System.out.println("������0��2֮���������");
			
		    int num = input.nextInt();
		    if(num<0||num>2){System.out.println("��������ȷ�����֣�");
		       return;}
    	    if(num==0){System.out.println("�������ʯͷ");}
    	    if(num==1){System.out.println("������Ǽ���");}
    	    if(num==2){System.out.println("������ǲ�");}
    	    
    	    System.out.println("�Ƿ�Ҫ������ȭ��(n/y)");
    	    answer = input.next();
      } while(answer.equals("y"));
     
     System.out.println("������");
     
     System.out.println("----------------------------------------------------------------------------------------");
     
     int i1 =1;
     int sum =0;
     for(i1 = 1;i1<=100&&i1>=1;i1+=2){
    	 sum = i1+sum;
     }
     System.out.println("������Ϊ��"+sum);
     
     int num =2;
     int sum2 =0;
    while(num<=100&&num>=2){
    	sum2 = sum2+num;
    	num+=2;
    }
     System.out.println("ż����Ϊ��"+sum2);
	
System.out.println("----------------------------------------------------------------------------------------------");
     
	 int j = 0;
     long result = 1;
     for ( j = 0; j <10; j++) {
         result *= (j + 1);
         System.out.println(result);
     }

     //hasNextInt():�����ж�����һ��������������ͣ������ָ�����;ͽ���true��
	    if(input.hasNextInt()){
	    	int number = input.nextInt();
	    	System.out.println("���������һ������");
	    } else {System.out.println("������Ĳ���һ������");}
		
	
	}
	
	
	}


