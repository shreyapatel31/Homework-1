
public class problem3 {
		private Node head;
		
	private class Node {
		int item;
		Node next;
		
	}
	
		public void linkedList () {
		Node n = head;
		while (n != null) {
			System.out.println(n.item + "");
			n = n.next;
		}
		}
	
	public static Node insertionSort(Node head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		 Node newHead = new Node(); //new value being added
		 Node ptr = head.next; //pointing to the value after the head
		 
		 while (ptr != null) {
			 Node newPtr = newHead; //pointing to the head
			 Node next = ptr.next; //next function for pointer1
			 	if (ptr.item < newHead.item) {
			 		Node temp = newHead;
			 		newHead = ptr;
			 		newHead.next = temp;
			 		System.out.println("Swapped" + newHead.item + "with" + ptr.item);
			 	}
			 	else {
			 		while (newPtr != null) {
			 			if (ptr.item > newPtr.item && ptr.item <= newPtr.next.item) {
			 				Node val = newPtr.next;
			 				newPtr.next = ptr;
			 				ptr.next = val;
			 				System.out.println("Swapped" + newPtr.next.item + "with" + ptr.item );
			 			} //if the pointer is smaller than next then it needs to be switched
			 			
			 			newPtr = newPtr.next;
			 		}
			 		if (newPtr.next == null && ptr.item > newPtr.item) {
			 			newPtr.next = ptr;
			 			ptr.next = null;
			 		} //at the end of the list the pointer will eventually point to NULL
			 	}
			 	
			 	ptr = next;
		 	}
		 System.out.println("Sort finished!");
		 
		 return newHead;
	
		 
		public printList (InsertionSort.x); {
			 if (x != null) {
				 System.out.println(x.item + "");
				 while(x.next != null) {
					 System.out.println(x.next.item + "");
					 x = x.next;
				 }
				 System.out.println();
			 }
		 }
		 		
	}
	
	public void push(int item) {
		Node first = head;
		head = new Node ();
		head.item = item;
		head.next = first;
		
	}
	
	public int pop() {
		int item = head.item;
		head = head.next;
		return item;
	}
	
	public int peek() {
		int item = head.item;
		return item;
	}
	
	public int pastPeek() {
		int item = head.item;
		head = head.next;
		return item;
		
	}
	
	public static void main (String [] args) {
		
	}

	}



