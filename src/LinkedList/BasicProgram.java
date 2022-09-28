package LinkedList;

public class BasicProgram {


	class Node{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}


	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data); 
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {

			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty");
		}
		while(current != null) {

			System.out.print(" "+current.data);
			current = current.next;

		}
	}
	
	public Node reverse() {
		
		Node node = head;
		Node prev = null;
		Node next = null;
		Node current = node;
		
		while(current != null) {
			System.out.println(current.data);
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
			
		}
		node = prev;
		return node;
		
	}
	


	public static void main(String[] args) {
		BasicProgram b = new BasicProgram();
		 b.addNode(10); b.addNode(20); b.addNode(30);
		 
		b.display();
        System.out.println(b.reverse().data);


	}

}
