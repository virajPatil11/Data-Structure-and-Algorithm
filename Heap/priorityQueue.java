package Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(20);
		p.add(15);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p.peek());
		
		System.out.println(p);
		
		p.add(25);
		p.add(30);
		System.out.println(p);
		
		Iterator i = p.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}
}
