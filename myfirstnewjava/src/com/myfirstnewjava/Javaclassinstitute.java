
package com.myfirstnewjava;

public class Javaclassinstitute {
	static String Trainername1 = "Ram"  ;
	static String Trainername2 = "Arjun";
	
	 
	String empname ;
	int empid ;
	String designation  ;
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		 
		Javaclassinstitute e1 = new Javaclassinstitute() ;
		e1.empname = "Sevitha";
		e1.empid = 101;
		e1.designation = "faculty";
		System.out.println("Trainername1 :"+ Trainername1);
		System.out.println("Trainername2 :"+ Trainername2);
		System.out.println("empname :"+ e1.empname);
		System.out.println("empid :"+ e1.empid);
		System.out.println("designation :"+ e1.designation);
		System.out.println(e1.hashCode());
		
		Javaclassinstitute e2 = new Javaclassinstitute() ;
		e2.empname = "Mahitha";
		e2.empid = 102;
		e2.designation = "trainee";
		System.out.println("empname2 :"+ e2.empname);
		System.out.println("empid2 :"+ e2.empid);
		System.out.println("designation2 :"+ e2.designation);
		System.out.println(e2.hashCode());
		
		Javaclassinstitute e3 = new Javaclassinstitute() ;
		e3.empname = "Ankitha";
		e3.empid = 103;
		e3.designation = "Manager";
		System.out.println("empname3 :"+ e3.empname);
		System.out.println("empid3 :"+ e3.empid);
		System.out.println("designation3 :"+ e3.designation);
		System.out.println(e3.hashCode());
		
		Javaclassinstitute e4 = new Javaclassinstitute() ;
		e4.empname = "Priya";
		e4.empid = 104;
		e4.designation = "coordinator";
		System.out.println("empname4 :"+ e4.empname);
		System.out.println("empid4 :"+ e4.empid);
		System.out.println("designation4 :"+ e4.designation);
		System.out.println(e4.hashCode());
		
		Javaclassinstitute e5 = new Javaclassinstitute() ;
		e5.empname = "Bose";
		e5.empid = 105;
		e5.designation = "Trainee";
		System.out.println("empname5 :"+ e5.empname);
		System.out.println("empid5 :"+ e5.empid);
		System.out.println("designation5 :"+ e5.designation);
		System.out.println(e5.hashCode());
		
		System.out.println("main method ended");
		
		
		
		
		// TODO Auto-generated method stub

	}

}

	