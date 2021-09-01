package hashing;
import java.util.HashSet;
public class IntersectionOfTwo {
	public static void main(String[] args) {
		int a[] = {5,10,15,5,10};
		int b[] = {15,10,4};
		System.out.println(intersect(a, b));
	}
	static int intersect(int a[], int b[]) {
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for(int x:a) {
			set.add(x);
		}
		
		for(int x:b) {
			if(set.contains(x)) {
				count++;
				set.remove(x);
				
			}
		}
		return count;
	}
}
