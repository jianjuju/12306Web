package Circulation;

public class Demo07 {

	public static void main(String[] args) {
         int sum = 0;
         int i =0;
		for(i= 1;i<=10;i++){
			sum+=i;
			if(sum>=20){
				System.out.println(sum);
				break;
			}
		}

	}

}
