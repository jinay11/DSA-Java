package dsa;

import java.util.Scanner;

public class PrimeNumberN {
	
	public static void main(String[] args) {
		
		System.out.println("Print the prime number till N");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the low number");
		
		int low = sc.nextInt();
		
		System.out.println("Enter the high number");
		
		int high = sc.nextInt();
		
		for(int i=low; i<=high; i++) {
			
//			System.out.println("Checking for numbers " + i);
			
			boolean prime = true;
			
			if(i < 2) {
				prime = false;
			}
			
			for(int j = 2 ; j*j <= i ;j++) {
				
				if(i % j == 0) {
					prime = false;
					break;
				}
				
			}
			
			if(prime) {
				System.out.println(i + " is a Prime number");
				
			}else {
				System.out.println(i + " is not a Prime number");
				
			}
			
			
		}
		
		
		
	}

}
