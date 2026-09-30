package dsa;

public class ConditionalState {
	public static void main(String[] args) {
		
		int  x = 10;
		int y = 10;
		
		//method 1
		if(x == y) {
			System.out.println("X is equal to y");
		}else {
			
			if(x > y) {
				System.out.println("x is greater than y");
			}else {
				System.out.println("x is smaller than y");
			}
		}
		System.out.println("HardWork is the key to success");
		
		//method 2
		if(x == y) {
			System.out.println(x +" is equal to " + y);
		}
		else if(x >y) {
			System.out.println(x + " is greater than " + y);
		}else {
			System.out.println(x +" is smaller than " + y);
		}
		
		
		
	}
}
