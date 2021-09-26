package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Insertionn {
	static class Node{
		int key;
		Node left,right;
		
		Node(int key){
			this.key = key;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;
	
	static void inorder(Node temp) {
		if(temp == null)
			return;
		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}
	
	static void insert(Node temp,int key) {
		if(temp == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);
		while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right);
        }
	}
	static void delete(Node root, int key)
	{
	    if (root == null)
	        return;
	         
	    if (root.left == null &&
	       root.right == null)
	    {
	        if (root.key == key)
	        {
	              root=null;
	              return;
	        }
	        else
	            return;
	    }
	     
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root);
	    Node temp = null, keyNode = null;
	     
	    // Do level order traversal until
	    // we find key and last node.
	    while (!q.isEmpty())
	    {
	        temp = q.peek();
	        q.remove();
	         
	        if (temp.key == key)
	            keyNode = temp;
	 
	        if (temp.left != null)
	            q.add(temp.left);
	 
	        if (temp.right != null)
	            q.add(temp.right);
	    }
	 
	    if (keyNode != null)
	    {
	        int x = temp.key;
	        insert(temp,key);
	        keyNode.key = x;
	    }
	}

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.right = new Node(12);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		
		System.out.print("Inorder traversal befor insertion: ");
		inorder(root);
		
        
        int key = 11;
        delete(root, key);
     
        System.out.print("\nInorder traversal " +
                         "after deletion:");
        inorder(root);
	}
	
}
