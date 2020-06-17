package inheritancepkg;

class A {
	int a;
	int b;

	void display() {
		System.out.println(a + b);

	}
}

class B extends A {
	int c;
	int d;

	void sum() {
		System.out.println(c + d);
	}
}

public class Inheritancetest {

	public static void main(String[] args) {

		A clsA = new A();
		clsA.a = 100;
		clsA.b = 200;
		clsA.display();

		B test = new B();
		test.a = 50;
		test.c = 40;
		test.d = 50;
		test.b = 20;
		test.sum();

	}

}
