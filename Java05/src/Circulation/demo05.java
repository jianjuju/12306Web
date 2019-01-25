package Circulation;

public class demo05 {

	public static void main(String[] args) {

		//外层循环控制行数，里层循环控制列数    
    
    for(int i = 1; i<=5 ;i++){
    	for(int j =5; j>i; j--){
    		System.out.print(" ");
    	}
    	for(int j=1; j<=i*2-1;j++){
    		System.out.print("*");
    	}
     
    	System.out.println();
    }
			
       for(int l=1;l<5;l++){
    	   for(int x=1;l>=x;x++){
    		   System.out.print(" ");
    	   }
    	for(int x=1;x<=l*2-1;x++){
    		 System.out.print("*"); }
       }
       System.out.println();
	}

}
