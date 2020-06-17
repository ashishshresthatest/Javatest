package interfaces;

interface A {
	int a = 20;

	void display();
}

interface B {
	int b = 60;

	void see();
}

public class MultipleInterfaceExample implements A, B {
	public void display() {
		System.out.println(a);
	}

	public void see() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		MultipleInterfaceExample MI = new MultipleInterfaceExample();
		MI.display();
		MI.see();

	}

}
