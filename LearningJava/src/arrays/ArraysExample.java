package arrays;

public class ArraysExample {

	public static void main(String[] args) {
		int a[] = new int[6]; // Declaration of variable
		// Store Elements
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 49;
		a[4] = 60;
		a[5] = 70;

		/*
		 * // for loops for (int i = 0; i <= 5; i++) { System.out.println(a[i]); }
		 */

		// For each loop

		for (int i : a) {
			System.out.println(i);
		}

	}

}
