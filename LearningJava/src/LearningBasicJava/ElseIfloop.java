package LearningBasicJava;

public class ElseIfloop {

	public static void main(String[] args) {
		int mark = 41;

		if (mark >= 90) {
			System.out.println(" Sudent Passed and Student is exception");
		} else if (mark >= 80) {
			System.out.println("Student passed and Student is good");
		}

		else if (mark >= 60) {
			System.out.println("Student Passed");
		} else if (mark > 40) {
			System.out.println("Student need to see Prinicipal");
		} else {
			System.out.println("Student Failed");
		}
	}

}
