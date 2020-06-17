package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(101, "ramkarki");
		hm.put(102, "ravikrishna");
		hm.put(103, "tiger");
		// System.out.println(hm);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());

		}
	}

}
