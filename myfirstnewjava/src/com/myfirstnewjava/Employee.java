package com.myfirstnewjava;

public class Employee {
	int empid ;
	String empname ;
	float empsalary ;
	
	void display() {
		System.out.println("Empid :"+ empid);
		System.out.println("Empname :"+ empname);
		System.out.println("Empsalary :"+empsalary);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Employee e1 = new Employee();
		e1.empid = 101;
		e1.empname = "Ram";
		e1.empsalary = 50000;
		
		Employee e2 = new Employee();
		e2.empid = 102;
		e2.empname = "Rishi";
		e2.empsalary = 80000;
		
		Employee e3 = new Employee();
		e3.empid = 103;
		e3.empname = "Priya";
		e3.empsalary = 70000;
		
		e1.display();
		e2.display();
		e3.display();
		
		System.out.println("Main method Ended");
		
		
		
		// TODO Auto-generated method stub

	}

}
