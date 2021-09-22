package dequeue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueOperation {
	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(1);
		dq.add(2);
		dq.addFirst(3);
		dq.addLast(4);
		System.out.println(dq);
		dq.offerFirst(10);
		dq.offerLast(20);
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
	}
}
