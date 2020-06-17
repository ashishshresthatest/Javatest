package exceptions;

public class HandleExceptionsExample {

	public static void main(String[] args) {
		int a = 20;
		try {
			System.out.println(a / 0); // Aritmetic Exceptions
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String s = null;
		try {
			s.length(); /// Null point Exceptions
		} catch (NullPointerException ee) {
			System.out.println(ee.getMessage());
		}
	}
}
