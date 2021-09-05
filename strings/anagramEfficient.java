package string;

public class anagramEfficient {
	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "aba";
		boolean isAnagram = true;
		
				
		int al[] = new int[256];
		//int bl[] = new int[256];
		
		for(char c:s1.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for(char c:s2.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		
		for(int i = 0; i < 256; i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
				
			}
		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
