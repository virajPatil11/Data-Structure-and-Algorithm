package Again;
import java.util.*;
public class DiceThrow {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
	}

}
