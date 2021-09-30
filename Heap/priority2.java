package Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		q.add(5);
		q.add(15);
		q.add(10);
		
		System.out.println("size: "+q.size());
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.poll();
		}
	}
}
