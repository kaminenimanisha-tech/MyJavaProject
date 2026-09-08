
package com.myfirstnewjava;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("  java");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mynewjava.Student");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		
		System.out.println("Mysql Driver Loaded Successfully");
		
	}

}

	



	

