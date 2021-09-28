package BinaryTree;

class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
}

public class FloorCeilBST {
	Node root;
	int floor;
	int ceil;
	
	public void floorCeilBSTt(Node root, int key) {
		while (root != null) {
			if(root.data == key) {
				ceil = root.data;
				floor = root.data;
				return;
			}
			if(key > root.data) {
				floor = root.data;
				root = root.right;
			}
			else {
				ceil = root.data;
				root = root.left;
			}
		}
		return;
	}
	
	public void floorCeilBST(Node root, int key) {
		floor = -1;
		ceil = -1;
		
		floorCeilBSTt(root,key);
		System.out.println(key + " " + floor + " " + ceil);
	}
	public static void main(String[] args) {
		FloorCeilBST tree = new FloorCeilBST();
		tree.root = new Node(8);
	    tree.root.left = new Node(4);
	    tree.root.right = new Node(12);
	    tree.root.left.left = new Node(2);
	    tree.root.left.right = new Node(6);
	    tree.root.right.left = new Node(10);
	    tree.root.right.right = new Node(14);
	     
	    for(int i = 0; i < 16; i++) {
	    	tree.floorCeilBST(tree.root, i);
	    }
	}

}
