package datastructure;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		{
			al.add("welcome");
			al.add(112);
			al.add(20.20);
			al.add('A');

			System.out.println(al.size());
			System.out.println(al);

			al.add(1, "tiger");
			System.out.println(al);

			al.remove(1);
			System.out.println(al);
		}
	}

}
