package recusion;

public class powerSet {
	public static void main(String[] args) {
		String s = "abc";
		String curr = "";
		System.out.println(find(s, 0, curr));
	}
	public static int find(String s , int i, String curr) {
		if(i == s.length()) {
			System.out.println(curr);
			return i;
		}
		else {
			find(s,i+1,curr+s.charAt(i));
			find(s,i+1,curr);
		}
	}
}	
