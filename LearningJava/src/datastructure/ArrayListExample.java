package datastructure;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("tiger");
		list.add("is fap");

		System.out.println(list.size());
		for (String a : list) {
			System.out.println(a);
		}

	}
}
