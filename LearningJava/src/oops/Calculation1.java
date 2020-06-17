package oops;

public class Calculation1 {
	int a;
	int b;

	int sum() {
		return (a + b);
	}

	public static void main(String[] args) {
		Calculation1 cal = new Calculation1();
		cal.a = 100;
		cal.b = 400;
		int r = cal.sum();
		System.out.println(r);

	}

}
