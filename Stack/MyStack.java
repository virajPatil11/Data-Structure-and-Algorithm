package stackk;

class Stack{
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty() {
		return (top < 0);
	}
	Stack(){
		top = -1;
	}
	boolean push(int x) {
		if(top >= (MAX - 1)) {
			System.out.println("Stack OverFlow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	int pop() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	int peek() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	void print() {
		for(int i = 0; i < top;i++) {
			System.out.print(" " + a[i]);
		}
	}
	
}


public class MyStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop() + " popped from stack");
		System.out.println("Top element is :" + s.peek());
		System.out.println("Elements present in stack :");
		System.out.println(s.isEmpty());
		s.print();
	}
}
