package BinaryTree;
import java.util.TreeSet;
public class TreeSetBST {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.contains(1));
		System.out.println(t.remove(4));
		System.out.println(t.pollFirst());
		t.add(5);
		System.out.println(t);
	}
}
