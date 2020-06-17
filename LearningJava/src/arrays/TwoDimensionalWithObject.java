package arrays;

public class TwoDimensionalWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration of 2 Dim
		Object a[][] = new Object[3][2];

		/// Storing values into arrays
		a[0][0] = 10;
		a[0][1] = "Ashish Shresths";
		a[1][0] = 'A';
		a[1][1] = 40;
		a[2][0] = 50;
		a[2][1] = 60;

		// Read arrays values Classic for rule
		/*
		 * for (int i = 0; i <= 2; i++) { for (int j = 0; j <= 1; j++) {
		 * System.out.println(a[i][j]); } }
		 */

		for (Object i[] : a) {
			for (Object j : i) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
