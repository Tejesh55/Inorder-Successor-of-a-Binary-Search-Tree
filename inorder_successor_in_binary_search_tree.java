package training;
import java.util.*;
class Node{
	int key;
	Node left, right;
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
class BinaryTree{
	Node root;
	BinaryTree(){
		root = null;
	}
	List<Integer> values = new ArrayList<>();
	void inorder(Node node) {
		if(node ==null) {
			return;
		}
		inorder(node.left);
		values.add(node.key);
		inorder(node.right);
	}
	void printvalues() {
		System.out.println(values);
	}
	void successor(int target) {
        int index = values.indexOf(target);
        if (index != -1 && index + 1 < values.size()) {
            System.out.println("Successor of " + target + " is: " + values.get(index + 1));
        } else {
            System.out.println(target + " does not have a successor.");
        }
    }
	
}
public class test{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.inorder(tree.root);
		tree.printvalues();
		tree.successor(8);
	}
}