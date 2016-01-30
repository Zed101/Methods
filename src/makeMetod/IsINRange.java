package makeMetod;

public class IsINRange {

	public static void main(String[] args) {
		int n= 15;
		int start = 20;
		int finish = 70;
		boolean tf = true;
		
//		if (number > finish || number < start){
//			tf = false;
//			System.out.println( "not in range " + tf);
//			
//		}else{
//			
//			System.out.println("In range " + tf);
//		}
		System.out.println(isInRange(10, 20, n));

	}
	
	
	public static boolean isInRange (int start, int finish, int n){
		
		
		
		if (n > finish || n < start){
			return false;
			
			
		}else{
			
			return true;
		}
	
	}

}
