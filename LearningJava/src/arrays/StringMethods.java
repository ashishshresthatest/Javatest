package arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// :=Length
		String s = "Welcome";
		System.out.println(s.length());

		// Concatenation
		String S1 = "Ashish";
		String S2 = "Shrestha";
		System.out.println(S1.concat(S2));

		/// Equals
		System.out.println(S1.equals(S2));

		// EqualsIgnoreCase
		String S4 = "ASHISH";
		System.out.println(S1.equalsIgnoreCase(S4));

		// Contains

		System.out.println(S4.contains("AS"));

		// SubString
		System.out.println(S4.substring(0, 5));
		System.out.println(S4.substring(2, 6));
		System.out.println(S4.substring(0, 2));

		// replace
		System.out.println(S4.replace('S', 'X'));
		System.out.println(S4.replace("ASHISH", "Shrestha"));
	}

}
