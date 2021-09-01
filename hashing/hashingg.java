package hashing;
import java.util.HashSet;

public class hashingg {
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		
		if(s.contains(3)) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
		
		s.remove(3);
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
	}
}
