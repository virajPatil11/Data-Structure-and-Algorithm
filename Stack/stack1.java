package stackk;
import java.util.*;
public class stack1 {
	public static void main(String[] args) {
		Stack <Integer> s = new Stack();
		
		// OPERATIONS
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		s.pop();
		System.out.println("Peek -" + s.peek());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.search(2));
	}
}
