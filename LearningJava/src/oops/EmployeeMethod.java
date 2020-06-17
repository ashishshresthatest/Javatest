package oops;

public class EmployeeMethod {
	int Employeeid;
	String Name;
	int salary;
	int deptno;

	void setdata(int id, String Nam, int sal, int deptN) {
		Employeeid = id;
		Name = Nam;
		salary = sal;
		deptno = deptN;
	}

	void display() {
		System.out.println(Employeeid);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(deptno);

	}

	public static void main(String args[]) {
		EmployeeMethod emp1 = new EmployeeMethod();
		emp1.setdata(200, "Shrestha", 3000000, 392);
		emp1.display();
	}

}
