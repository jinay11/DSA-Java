package dsa;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number ");
//		
//		int t = sc.nextInt();
//		
//		for(int i=1; i<=t ; i++) {
//			
//			System.out.println("Enter the index " + i + " number for checking prime or not ");
//			int n = sc.nextInt();
//			
//			int count = 0;
//			for(int div=2 ; div*div <= n; div++) {
//				
//				if(n % div == 0) {
//					count++;
//					break;
//				}
//				
//			}
//			if(count == 0) {
//				System.out.println("Prime number " + n);
//			}else {
//				System.out.println("Not a  Prime " + n);
//			}
			
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			System.out.println("Enter the index " + i + " number for checking prime or not ");
			int n = sc.nextInt();
			
			int count = 0;
			for(int div=1; div <= n ; div++) {
				
				if(n % div == 0 ) {
					System.out.println(div + " is a divisor of " + n);
					count++;
				}
				
			}
			if(count ==2) {
				System.out.println(n + " is a Prime number");
			}else {
				System.out.println(n + " is not a Prime number");
			}
			
		}
		
		
		
	}

}
