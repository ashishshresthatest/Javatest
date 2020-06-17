package oops;

public class StaticExample {
	int a;
	static int b;

	void m1() {

		System.out.println("this is nonstatic");
	}

	static void m2() {

		System.out.println("this is static");
	}

	void m3() {
		a = 200;
		b = 300;
		m1();
		m2();
	}

	public static void main(String[] args) {

		StaticExample se = new StaticExample();
		se.a = 200;
		System.out.println(se.a);

		se.m1();
		se.m2();
		se.m3();

	}

}
