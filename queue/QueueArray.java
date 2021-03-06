package queue;

class Queue{
	int front,rear,size;
	int capacity;
	int array[];
	
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue q) {
		return (q.size == q.capacity);
	}
	
	boolean isEmpty(Queue q) {
		return(q.size == 0);
	}
	
	void enqueue(int item) {
		if(isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size += 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
		
	}
}

public class QueueArray {
	public static void main(String[] args) {
		Queue q = new Queue(1000);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println(q.dequeue() + " dequeued form queue\n");
	}
}
