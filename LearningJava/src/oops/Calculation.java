package oops;

public class Calculation {

	int a;
	int b;
/// Method 1 : takes no parameter
	/*
	 * void sum() { System.out.println(a + b); }
	 */

	/// Method 2: Method takes parameter
	void sum(int x, int y) {
		a = x;
		b = y;
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		/*
		 * Calculation cal = new Calculation(); this is for t=first method cal.a = 100;
		 * cal.b = 200; cal.sum();
		 */
		Calculation cal = new Calculation(); /// This is for second method
		cal.sum(100, 200);
	}

}
