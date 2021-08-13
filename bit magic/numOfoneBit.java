package bitwise;

import java.util.Scanner;

public class numOfoneBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countBits(n));
	}
	public static int countBits(int n) {
		int count = 0;
		while( n != 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
}
