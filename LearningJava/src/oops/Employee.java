package oops;

public class Employee {

	int Employeeid;
	String name;
	int salary;
	int deptno;

	void display() {
		System.out.println(Employeeid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptno);
	}

	public static void main(String args[]) {
		Employee emp1 = new Employee();
		emp1.Employeeid = 101;
		emp1.name = "Test";
		emp1.salary = 100000;
		emp1.deptno = 99;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.Employeeid = 201;
		emp2.name = "DUmmy";
		emp2.salary = 10000;
		emp2.deptno = 200;
		emp2.display();

	}
}
