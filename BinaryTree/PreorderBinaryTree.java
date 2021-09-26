package BinaryTree;

import java.util.Stack;

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class PreorderBinaryTree {
	Node root;
	void iterativePreorder()
    {
        iterativePreorder(root);
    }
	void iterativePreorder(Node node) {
		if(node == null)
			return;
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while(s.empty() == false) {
			Node mynode = s.peek();
			System.out.print(mynode.data + " ");
			s.pop();
			
	        if (mynode.right != null) {
	            s.push(mynode.right);
	        }
	        if (mynode.left != null) {
	        	s.push(mynode.left);
	        }

		}

	}
	public static void main(String[] args) {
		PreorderBinaryTree tree = new PreorderBinaryTree();
		tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iterativePreorder();

	}
	
}
