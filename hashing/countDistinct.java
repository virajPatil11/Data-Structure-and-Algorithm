package hashing;
import java.util.HashSet;
public class countDistinct {
	public static void main(String[] args) {
		int arr[] = {4,3,1,2,3,4};
		System.out.println(countDist(arr));
	}
	static int countDist(int a[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int element: a) {
			set.add(element);
		}
		return set.size();
	}
}
