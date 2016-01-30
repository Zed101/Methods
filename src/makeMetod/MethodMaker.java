package makeMetod;

import java.util.Scanner;

public class MethodMaker {

	public static void main(String[] args) {
		
		int n = 2;
		System.out.println(getNextOddNumber(n));
		
			
		
		
	}
	
	public static int getNextOddNumber (int n){
		if(n % 2 == 0){
			return n+1;
		}else{
			return n+2;
		}
		
		
		
	}

}
