package oops;

public class UsingConstructor {
	int Employeeid;
	String name;
	int salary;
	int deptno;

	UsingConstructor(int id, String Namef, int sal, int dept) {
		Employeeid = id;
		name = Namef;
		salary = sal;
		deptno = dept;
	}

	void display() {
		System.out.println(Employeeid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptno);

	}

	public static void main(String args[]) {
		UsingConstructor US = new UsingConstructor(100, "ashish", 30000, 300);
		US.display();
	}
}