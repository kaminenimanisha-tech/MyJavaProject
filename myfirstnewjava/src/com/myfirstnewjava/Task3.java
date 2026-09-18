package com.myfirstnewjava;

public class Task3 {
	static Task3 t1 = new Task3();
	
	static void addition(int a, int b) {
		System.out.println("addition");
		int result = a+b;
		System.out.println(result);
		t1.subtraction(result,5);
		
	}
	
	void  subtraction( int a ,int b) {
		System.out.println("substraction");
		int result = a-b;
		System.out.println(result);
		t1.multiplication(result,10);
		
	}
	
	void multiplication(int a,int b) {
		System.out.println("Multiplication");
		int result = a*b;
		System.out.println(result);
		t1.division(result,20);
		
	}
	
	void division(int a ,int b) {
		System.out.println("Division");
		int result = a/b;
		System.out.println(result);
	}


	public static void main(String[] args) {
		System.out.println("Main method started");
		
		t1.addition(10,20);
		
		System.out.println("Main method ended");
		
		
		}
	
}
