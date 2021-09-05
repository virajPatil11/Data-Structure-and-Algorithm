package string;

class Ffind{
	static int NO_OF_CHARS = 256;
	
	static int firstRepeating(String str) {
		boolean[] visited = new boolean[NO_OF_CHARS];
		for(int i = 0; i < NO_OF_CHARS; i++)
			visited[i] = false;
		
		int res = -1;
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(visited[str.charAt(i)] == false)
				visited[str.charAt(i)] = true;
			else
				res = i;
		}
		return res;
	}
}

public class leftmostCharRepeats {
	public static void main(String[] args) {
		String str = "abba";
		Ffind f = new Ffind();
		System.out.println(f.firstRepeating(str));
	}
}

