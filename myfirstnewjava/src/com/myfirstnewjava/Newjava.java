package com.myfirstnewjava;

public class Newjava {
	static Newjava n1 = new Newjava();
	static {
		n1 = new Newjava();
		display1();
		}
	
	static void display1() {
		System.out.println("hello java");
	    
		
	}
	static void display2() {
		System.out.println ("Jvm introduction");
	   n1.display3();
	}
	void display3 () {
		System.out.println("MY sql");
		n1.display4();
	}
	void display4 () {
		System.out.println("sql");
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		display2();
	}

}
