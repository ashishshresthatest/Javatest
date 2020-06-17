package oops;

public class MethodOverloading {
	int a = 10;
	int b = 20;

	void sum() /// First method
	{
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		int a = x;
		int b = y;
		System.out.println(a + b);

	}

	void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	void sum(int a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading MO = new MethodOverloading();
		MO.sum(); // 1st method
		MO.sum(20, 30); // 2nd Method
		MO.sum(50, 50, 50); // 3rd Method
		MO.sum(20, 20.40); // 4th method

	}

}
