package dsa;

import java.util.Scanner;

public class checkPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		m = n / 2;
		int flag = 0;
		if(n <= 1) {
			System.out.println("Not a prime number");
		}
		else {
			for(int i = 2 ; i <= m; i++) {
				if(n % i == 0) {
					System.out.println("Not a prime number");
					flag++;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Prime Number");
			}
		
		}
		
	}
}
