package StacksAndQueues;
//created by Fayed Raza
public class Queue {
    
	public Queue(char s) {
		add(s);
	}
	
	private Node head;  //remove from head
	private Node tail; //add things here
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public char peek() {
		return head.data;
	}
	
	public void add(char data) {
		Node test = new Node(data);
		if(tail !=  null) {
			tail.next = test;
		}
		tail=test;
		if(head == null) {
			head = test;
		}
	}
	
	public char remove() {
		char data = head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
