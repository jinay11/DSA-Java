package dsa;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		
		System.out.println("count digits in a number");
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int digits = 0;
		
		while(n != 0) {
			n = n / 10;
			digits++;
		}
		System.out.println("Number of digits: " + digits);
		
	}
}
