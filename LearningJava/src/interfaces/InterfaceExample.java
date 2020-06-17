package interfaces;

interface Interfac {
	int a = 400;

	void result();
}

public class InterfaceExample implements Interfac {
	public void result() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		InterfaceExample intf = new InterfaceExample();
		intf.result();
	}

}
