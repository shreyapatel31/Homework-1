import java.util.Scanner;

public class problem4 {
	private int val;

	static void problemFourA (String string) {
		StringBuilder reverse = new StringBuilder ();
		
		for(int i=string.length() - 1; i >= 0; i--) {
			reverse.append(string.charAt(i));
		}
		System.out.println(reverse.toString());
	}
	
	static void problemFourB (int m, int n, int sum) {
		int value = 0;
		int [][] array = new int [m] [n];
		System.out.println("Enter the size of the 2 dimensional array and the sum:");
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= n; j++) { //the array initial search
					for (int x = i+1; x <= m; x++) {
						for (int y = j+1; y <= n; y++ ) { //the same array but searching for the second value
							if (array[i][j] + array[x][y] == sum) {
								System.out.print("(" + array[i][j]+ ",");
								System.out.print(array[x][y]+ ")");
							}
						}
				
					}
				}
			}
	}
	
	 void problemFourC () {
		double [] arr = new double [val];
		for (double i = 0; i <= val; i++) {
			for (double j = 0; j <= val; j++) {
				for (double k = 0; k <= val; k++) {
					arr[(int) i] = (Math.pow(9, i) * Math.pow(15, j) * Math.pow(7, k));
				}
			}
		}
		
	}
	
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Reverse this string: ");
		String string;
		string = input.nextLine();
		
		problemFourA(string);
	}
	
	
}

