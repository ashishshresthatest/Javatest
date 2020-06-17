package exceptions;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		int a = 20;
		/*
		 * try { System.out.println(a / 0); // Aritmetic Exceptions } catch
		 * (NullPointerException e) { System.out.println(e.getMessage()); }
		 * 
		 * finally { System.out.println("Database connection is set"); }
		 */
		try {
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("Database connection is set");
		}
	}

}
