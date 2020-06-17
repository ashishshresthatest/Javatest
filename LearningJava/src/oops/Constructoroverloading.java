package oops;

public class Constructoroverloading {
	int a = 0;
	int b = 0;
	double c = 0;

	Constructoroverloading() {
		a = 10;
		b = 20;
		c = 20.30;
	}

	Constructoroverloading(int x, int y) {

		a = x;
		b = y;

	}

	Constructoroverloading(int a, double c) {
		this.a = a;
		this.c = c;
	}

	Constructoroverloading(int a, int b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructoroverloading co = new Constructoroverloading(); /// first
		// Constructoroverloading co = new Constructoroverloading(100, 300); /// Second
		// Constructoroverloading co = new Constructoroverloading(100, 300.84);/// third
		Constructoroverloading co = new Constructoroverloading(100, 300, 400.593);
		co.display();

	}

}
