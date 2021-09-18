package stackk;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.push(5);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
	}
}
