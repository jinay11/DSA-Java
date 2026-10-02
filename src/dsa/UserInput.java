package dsa;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ");
		int n = sc.nextInt();

		sc.nextLine();
		
		System.out.println("enter your name");
		String name = sc.nextLine();
		
		System.out.println("Welcome " + name + " here is the counting. ");
		
		System.out.println("---------------");
		
		for (int i = 1; i <= n; i++) {
			System.out.println("i = " + i);
		}

		

		

	}

}
