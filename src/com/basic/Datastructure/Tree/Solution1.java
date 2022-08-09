package com.basic.Datastructure.Tree;


/**
 * 
 * 
 * @author Prajapati
 * 
 * 
 *     6
       / \
     3    5
   /   \    \
  2     5    4  
      /   \
     7     4
     
  There are 4 leaves, hence 4 root to leaf paths:
   Path                    Number
  6->3->2                   632
  6->3->5->7               6357
  6->3->5->4               6354
  6->5>4                    654   
 Answer = 632 + 6357 + 6354 + 654 = 13997 
 *
 */

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		left=right = null;
	}
}

public class Solution1 {
	
	Node root;

	public static void main(String[] args) {
		
		Solution1 tree = new Solution1();
		tree.root = new Node(6);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(4);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(4);
        tree.root.left.right.left = new Node(7);
          
        System.out.print("Sum of all paths is " + sum(tree.root,0));  
	}
	
	public static int sum(Node root, int val) {
		
		//base case return zero if root in null
		if(root==null)
			return 0;
		
		//creating a number
		val = val*10 +root.data;
		
		//returning  value if the left and right node is null
		if(root.left==null && root.right==null)
			return val;
		
		//calling for subtree. 
		return sum(root.left,val) + sum(root.right, val);
		
	}

}
