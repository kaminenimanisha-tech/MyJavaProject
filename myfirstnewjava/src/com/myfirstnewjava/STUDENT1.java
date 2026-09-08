
package com.myfirstnewjava;

public class STUDENT1 {
	static String collegename = "CMR";
	String name ;
	int age;
	void display(){
		System.out.println("Collegename :" + collegename);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	public static void main(String[] args) {
		STUDENT1 s1 = new STUDENT1();
		s1.name = "Ram";
		s1.age = 21;
		STUDENT1 s2 = new STUDENT1();
		s2.name = "Priya";
		s2.age = 22;
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}