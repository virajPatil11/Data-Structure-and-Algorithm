package Again;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number: ");
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String n = br.readLine();
		
		System.out.println(n + " is your roll number");
	}
}
