package Again;

public class stringgMatch {
	static void search(String txt, String pat) {
		int m = pat.length();
		int n = txt.length();
		
		for(int i = 0; i < n; i++) {
			
			int j;
			for(j = 0; j < m; j++) {
				if(txt.charAt(i+j) != pat.charAt(j))
					break;
				
				
			}
			if(j == m)
				System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		String txt = "abcdeabc";
		String pat = "abc";
		search(txt,pat);
	}
}
