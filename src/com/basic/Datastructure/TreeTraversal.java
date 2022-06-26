package com.basic.Datastructure;

public class TreeTraversal {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Inorder traversal of binary tree is :");
        tree.printInOrder(tree.root);
 
        System.out.println("Preorder traversal of binary tree is :");
        tree.printPreOrder(tree.root);
 
        System.out.println("Postorder traversal of binary tree is :");
        tree.printPostOrder(tree.root);
	}

}

class BinaryTree{
	Node root;
	
	public BinaryTree() {
		root=null;
	}
	
	//InOrder -  root -> left -> right
	public void printInOrder(Node root) {
		if(root==null) return;
		System.out.println(root.getData());
		printInOrder(root.left);
		printInOrder(root.right);
		
	}
	
	//PreOrder -  left ->  root -> right
	public void printPreOrder(Node root) {
		if(root==null) return;
		printPreOrder(root.left);
		System.out.println(root.getData());
		printPreOrder(root.right);
	}
	
	//PostOrder -  right -> left ->  root
	public void printPostOrder(Node root) {
		if(root == null) return;
		printPostOrder(root.right);
		printPostOrder(root.left);
		System.out.println(root.getData());
	}
}

class Node{
	private int data;
	Node left, right;
	
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
}
