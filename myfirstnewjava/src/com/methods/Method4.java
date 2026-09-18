package com.methods;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square(10);
		cube(4);
		rectangle(41,57);
	}
	static void Square(int a){
		int Square = a*a;
		System.out.println("Square :"+ a*a);
	}
	static void cube(int a) {
		int cube = a*a*a;
		System.out.println("Cube :"+ a*a*a);
	}
	static void rectangle(int a , int b) {
		int rectangle = a*b;
		System.out.println("Rectangle :"+ rectangle);
	}

}
