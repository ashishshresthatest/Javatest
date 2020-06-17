package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declaration of 2 Dim
		int a[][] = new int[3][2];

		/// Storing values into arrays
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		// Read arrays values Classic for rule
		/*
		 * for (int i = 0; i <= 2; i++) { for (int j = 0; j <= 1; j++) {
		 * System.out.println(a[i][j]); } }
		 */

		for (int i[] : a) {
			for (int j : i) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
