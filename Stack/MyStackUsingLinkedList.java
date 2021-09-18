package stackk;


public class MyStackUsingLinkedList {
	
	StackNode root;
	
	static class StackNode{
		int data;
		StackNode next;
		
		StackNode(int data){
			this.data = data;
		}
	}
	public boolean isEmpty() {
		if(root == null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		
		if(root == null) {
			root = newNode;
		}
		else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " pushed to stack");
	}
	
	public int pop() {
		int popped = Integer.MIN_VALUE;
		if(root == null) {
			System.out.println("Stack is Empty");
		}
		else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	public int peek() {
		if(root == null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	public void show() {
		StackNode cur = root;
		while(cur != null) {
			System.out.print(cur.data + " " );
			cur = cur.next;
		}
	}
	public static void main(String[] args) {
		MyStackUsingLinkedList sll = new MyStackUsingLinkedList();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.pop() + " popped from stack");
		sll.show();
	}
}
