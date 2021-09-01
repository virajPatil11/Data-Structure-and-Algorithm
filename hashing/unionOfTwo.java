package hashing;
import java.util.HashSet;
public class unionOfTwo {
	public static void main(String[] args) {
		int a1[] = {5,10,15,5,10};
		int a2[] = {15,10,4};
		System.out.println(union(a1, a2));
	}
	static int union(int a1[], int a2[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int x: a1) {
			set.add(x);
		}
		for(int x:a2) {
			set.add(x);
		}
		return set.size();
	}
}
