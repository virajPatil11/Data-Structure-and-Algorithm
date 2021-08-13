package dsa;

import java.util.Scanner;

public class additionOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//calling function
		System.out.println(sum(a,b));
	}
	public static int sum(int a , int b) {
		return a + b;
	}
}
