package string;

import java.util.Arrays;

public class anagramOptimized {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
	
		char temp1[] = s1.toCharArray();
		char temp2[] = s2.toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		System.out.println(temp1);
		System.out.println(temp2);
		
		if(Arrays.equals(temp1, temp2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagarm");
		}
	}
}
