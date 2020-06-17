package inheritancepkg;

class Vechile {
	void run() {
		System.out.println("This is car");
	}
}

class Bike {
	void run() {
		System.out.println("this is bike");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		/*
		 * Vechile v = new Vechile(); v.run();
		 */

		Bike B = new Bike();
		B.run();

	}

}
