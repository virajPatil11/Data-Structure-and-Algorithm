package queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueOperation {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.poll()args;
		System.out.println(q);
		System.out.println(q.peek());
	}
}
