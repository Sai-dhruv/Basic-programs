package double_linked_List;

import java.util.Iterator;

public class BasicProgram {


	class Node{
		int data;
		Node previous;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	Node head , tail = null;
	int count = 0;

	public void add(int data) {
		Node newOne = getNode(data);
		if(head == null) {
			head = tail =newOne;
			head.previous = null;
			tail.next = null;
		}else {
			tail.next = newOne;
			newOne.previous = tail;
			tail = newOne;
			tail.next = null;
		}
	}
	public void addFirst(int data) {
		Node temp = getNode(data);
		temp.next = head;
		temp.previous = null;
		head.previous = temp;
		head = temp;
	}

	public void addMiddle(int data) {

		if(head == null) {
			head = tail = getNode(data);
			head.previous = null;
			tail.next = null;
		}else {
			Node middle = getNode(data);
			Node currentNode = head;
			Node temp = null;
			int mid = (count % 2 == 0) ? (count/2) : ((count+1)/2);
			System.out.println(mid);
			for(int i=1;i<mid;i++) {
				currentNode = currentNode.next; 
			}
			temp = currentNode.next;
			temp.previous = currentNode;
			middle.next = temp;
			middle.previous = currentNode;
			currentNode.next = middle;
			temp.previous = middle;
		}
	}





	Node getNode(int data) {
		count++;
		return new Node(data);
	}



	public void display() {
		Node currentNode = head;
		if(currentNode == null) {
			System.out.println("List is empty ");
			return;
		}
		while(currentNode != null) {
			System.out.println(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

	public void findMiddleElement() {
		Node f = head;
		Node s = head;
		while(f != null && f.next != null ) {
			f = f.next.next;
			s= s.next;
		}
		System.out.println(s.data);
	}

	public void deleteFirstNode() {
		if(head != null) {
			Node temp = head.next;
			temp.previous = null;
			head = temp;
		}
	}

	public void deleteLastNode() {
		if(tail != null) {
			Node temp = tail.previous;
			temp.next = null;
			tail = temp;
		}
	}


	public static void main(String[] args) {
		BasicProgram basicProgram = new BasicProgram();
		basicProgram.add(10);
		basicProgram.addFirst(50);
		basicProgram.add(12);
		basicProgram.add(14);
		basicProgram.addMiddle(100);
		basicProgram.findMiddleElement();
		System.out.println("=================================");
		basicProgram.display();
		basicProgram.deleteFirstNode();
        basicProgram.deleteLastNode();
		System.out.println("-----------------------------------");
		basicProgram.display();
	}

}
