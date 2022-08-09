package com.basic.Datastructure;

/**
 * 
 * @author rparjapati
 * 
 * 10 -> 20 -> 30
 * 		40 -> 50 -> 60
 * 			   70 -> 80 ->90	
 *
 */

public class FlatTheList {
	
	NodeWithChild head;
	
	public static void main(String[] args) {
		
		FlatTheList ll = new FlatTheList();
		ll.head= new NodeWithChild(10);
		ll.head.next= new NodeWithChild(20);
		ll.head.next.next= new NodeWithChild(30);
		ll.head.next.child= new NodeWithChild(40);
		ll.head.next.child.next= new NodeWithChild(50);
		ll.head.next.child.next.next= new NodeWithChild(60);
		ll.head.next.child.next.child= new NodeWithChild(70);
		ll.head.next.child.next.child.next= new NodeWithChild(80);
		ll.head.next.child.next.child.next.next= new NodeWithChild(90);
		
		faltTheList(ll.head);
		printList(ll.head);
		
	}
	
	public static NodeWithChild faltTheList(NodeWithChild head) {
		
		NodeWithChild temp=head , tempNext= null;
		while(temp!=null) {
			if(temp.child!=null) {
				tempNext = temp.child;
				addAtLast(head, tempNext);
				deleteChild(temp);
			}
			temp = temp.next;
		}
		return head;
	}
	
	public static NodeWithChild addAtLast(NodeWithChild head, NodeWithChild nextTemp) {
		NodeWithChild temp = head, lastNode=null;
		while(temp!=null) {
			if(temp.next==null)
				lastNode= temp;
			temp = temp.next;
		}
		lastNode.next=nextTemp;
		return head;
	}
	
	public static void deleteChild(NodeWithChild head) {
		head.child=null;
	}
	
	public static void printList(NodeWithChild node) {
		NodeWithChild temp = node;
		while(temp!=null) {
			System.out.print(temp.data + ", ");
			temp=temp.next;
		}
	}

}

class NodeWithChild{
	int data;
	NodeWithChild next, child;
	
	NodeWithChild(int x){
		data=x;
		next=child=null;
	}
}
