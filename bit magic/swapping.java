package bitwise;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//before swapping 
		System.out.println("BEFORE SWAPPING: ");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		//swap method
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		//After swapping
		System.out.println("AFTER SWAPPING");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
