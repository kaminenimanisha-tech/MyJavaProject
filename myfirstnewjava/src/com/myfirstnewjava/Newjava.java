package com.myfirstnewjava;

public class Newjava {
	static Newjava n1 = new Newjava();
	static {
		n1 = new Newjava();
		display1();
		}
	
	static void display1() {
		System.out.println("method 1 called");
	    
		
	}
	static void display2() {
		System.out.println ("method 2 called");
	   n1.display3();
	}
	void display3 () {
		System.out.println("method 3 called");
		n1.display4();
	}
	void display4 () {
		System.out.println("method 4 clled");
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		display2();
	}

}
