package exceptions;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		int a = 20;
		// System.out.println(a / 0); //Aritmetic Exceptions

		String s = null;
		s.length(); /// Null point Exceptions

		String m = "abcd";
		// int i = Integer.parseInt(m);
		/// System.out.println(m); //Number formart Exception

		int arr[] = new int[5];
		// arr[10] = 100;
		// System.out.println(arr[0]);
	}

}
