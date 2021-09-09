package linked;

public class LinkedList {
	
	Node head;
	
	public void insert(int data, int pos) {
		Node toAdd = new Node();
		toAdd.data = data;
		toAdd.next = null;
		
		if(pos == 0) {
			toAdd.next = head;
			head = toAdd;
			return;
		}
		else {
			Node prev = head;
			for(int i = 0; i < pos -1;i++) {
				prev = prev.next;
			}
			toAdd.next = prev.next;
			prev.next = toAdd;
		}
		
	}
	
	public void delete(int pos) {
		if(pos == 0) {
			head = head.next;
			return;
			
		}
		else {
			Node prev = head;
			for(int i = 0; i < pos -1; i++) {
				prev = prev.next;
			}
			prev.next = prev.next.next;
		}
	}
	
	public void show() {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data + " " );
			cur = cur.next;
		}
	}
}
