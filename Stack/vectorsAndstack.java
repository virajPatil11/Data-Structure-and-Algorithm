package stackk;
import java.util.*;
public class vectorsAndstack {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.firstElement());
		
	}
}
