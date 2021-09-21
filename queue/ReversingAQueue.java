package queue;
import java.util.Queue;
import java.util.Stack;

import recusion.reverseString;

import java.util.LinkedList;
public class ReversingAQueue {
	
	public static Queue<Integer> q;
	
	public static void print() {
		while(!(q.isEmpty())) {
			System.out.print(q.peek() + " ");
			q.remove();
		}
	}
	
	public static void reverse() {
		Stack<Integer> s = new Stack<>();
		while(!(q.isEmpty())) {
			s.add(q.peek());
			q.remove();
		}
		while(!(s.isEmpty())) {
			q.add(s.peek());
			s.pop();
		}
	}
	public static void main(String[] args) {
		q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);
		
		reverse();
		print();
		
	}
	
}
