
public class problem2 {
	int n;
	int [] array = new int [n];
	
	public void error () {
		if(array[n] == 0) {
		System.out.println("The fucntions cannot be performed since the array has length 0");
		}
	}
	
	
	public void push (int s) {
		int value = s;
		for (int i = 0; i <= array.length; i++) {
			array [i] = array[i+1];
		}
		array[0] = value;
	}
	
	public int pop () {
		int temp = array[0];
		for (int i = 1; i <= array.length; i++) {
			array[i] = array[i-1];
		}
		return temp;
	}
	
	public void enqueue (int s) {
		int value = s;
		array[n] = array[n+1];
		array[n] = value;
	}
	
	public int dequeue () {
		int temp = array[n];
		for (int i = 0; i <= array.length-1; i++) {
			array[i] = array[i+1];
		}
		return temp;
	}
	
	public void traverse (int index) {
		System.out.println(array[index]);
	}
	
public static void main(String[] args) {
	problem2 A = new problem2 ();
	A.push(9);
	A.pop();
	A.enqueue(4);
	A.dequeue();
	A.traverse(3);
}
	}


