package Circulation;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
     
		int count = 0;
     for(int i =1;i<=5;i++){
    	 System.out.println("�������"+i+"�γɼ�");
    	 
    	 double score = input.nextDouble();
    	 
    	 //�������scoreС��80����������ѭ����������count++
    	 if(score<80){
    		 continue;
    	 }
       count++; //���ڽ�������ѭ��
    }
	    System.out.println("����80������Ϊ��"+count/5.0*100+"%");
	}

}
