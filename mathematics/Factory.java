package learn;

public class Factory {
	public static void main(String[] args) {
		String s = "abc";
		int l = 0;
		int n = s.length();
		int r = n-1;
		per(s,l,r);
	}
	public static void per(String s, int l, int r) {
		if(l==r) {
			System.out.print(s+ " ");
			return;
		}
		for(int i = l; i <= r; i++) {
			s = swap(s,l,r);
			per(s,l+1,r);
			s=swap(s,l,i);
		}
	}
	private static String swap(String s, int l, int r) {
		// TODO Auto-generated method stub
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
