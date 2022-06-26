package com.basic.Datastructure;

public class SingleLinkedList {
	
	Node head;
	
	class Node {
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
	
	public synchronized void  push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.err.println(temp.data);
			temp=temp.next;
		}
	} 
	
	
	private void deleteNode(int key) {
		  Node temp = head, prev = null;
		  
		  if (temp != null && temp.data == key) {
		    head = temp.next;
		    return;
		  }
		  
		  while (temp != null && temp.data != key) {
		    prev = temp;
		    temp = temp.next;
		  }
		  
		  if (temp == null)
		    return;
		 
		  prev.next = temp.next;
		}
	
	public void deleteEvenNumber() {
		Node temp = head;
				
		while(temp!= null ) {
			if(temp.data%2==0) {
				deleteNode(temp.data);
			}
			temp=temp.next;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Adding to Link List");
		
		SingleLinkedList sll = new SingleLinkedList();
		
		sll.push(16);
		sll.push(101);
		sll.push(3);
		sll.push(15);
		sll.push(17);
		sll.push(13);
		sll.push(18);
		sll.push(12);
		sll.push(16);
		System.out.println("Printing the List ");
		//sll.printList();
		
		
		System.out.println("calling delete method");
		sll.deleteEvenNumber();
		System.out.println("Printing after deletion ");
		sll.printList();
	}

}
