package inheritancepkg;

class Bank {

	int returnInterestrate() {
		return 0;
	}
}

class SBI extends Bank {
	int returnInterestrate() {
		return 12;
	}
}

class ICICI extends Bank {
	int returnInterestrate() {
		return 11;
	}
}

class NBI extends Bank {
	int returnInterestrate() {
		return 12;
	}
}

public class Overriding {

	public static void main(String[] args) {
		SBI test = new SBI();
		System.out.println(test.returnInterestrate());
		ICICI test1 = new ICICI();
		System.out.println(test1.returnInterestrate());

	}

}
