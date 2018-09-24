
public class problem1<Item> {
	
	private Node head;
	private Node tail;
	private int s;
	
	problem1(){
		head = null;
	}	
	private class Node {
		Item item;
		Node next; //the next pointer
		
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	public int size () {return s;}
	
	public void push(Item item) {
		Node first = head; 
		head = new Node(); //initializing the new node first
		head.item = item;
		head.next = first; //pointing the head pointer back to first
		s++; //rearranging the size of the list
		
	}
	
	public Item pop() {
		Item item = head.item;
		head = head.next; //pointing the head pointer to the second node
		s--;
		return item;
	}
	
	public void enqueue (Item item) {
		Node last = tail;
		tail = new Node (); //initializing the new tail node
		tail.item = item;
		tail.next = null; //pointing to NULL removes the node 
		
	}
	
	public Item dequeue () {
		Item item = tail.item;
		tail.next = null; //making the tail point to NULL to remove it
		s--;
		return item;
		}
		
		
	public void traverse(int index){
		Node pointer = head;
		for (int i = 0; i < index; i++) {
			pointer = pointer.next;
		}
		System.out.println(pointer.item); //prints out the item at the index needed
	}
public static void main(String[] args) {
	problem1 <String> A = new problem1 <String> ();
	A.push("2");
	A.pop();
	A.enqueue("8");
	A.dequeue();
	A.traverse(5);
	}
}

