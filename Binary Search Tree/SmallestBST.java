package BinaryTree;

class Node{
	int data;
	Node left,right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
}
public class SmallestBST {
	static int count = 0;
	Node root;
	
	public static Node insert(Node node, int k) {
		if(node == null)
			return new Node(k);
		
		if(k < node.data)
			node.left =  insert(node.left,k);
		else if(k > node.data)
			node.right = insert(node.right,k);
		return node;
	}
	
	public static Node kthSmallest(Node node, int k) {
		if(node == null)
			return null;
		Node left = kthSmallest(node.left , k);
		
		if(left != null)
			return left;
		count++;
		if(count == k)
			return node;
		return kthSmallest(node.right ,k);
	}
	
	public static void printKthSmall(Node root, int k) {
		count = 0;
		
		Node res = kthSmallest(root,k);
		if(res == null)
			System.out.println("There are less than k nodes in the BST");
		else
			System.out.println(res.data);
	}
	public static void main(String[] args) {
        Node root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
      
        for (int k : keys)
            root = insert(root, k);
         
        int k = 3;
        printKthSmall(root, k);

	}
}
