package com.myfirstnewjava;

public class Task2 {
	int emid;
	int age;
	int emsal;
	char grade;
	int exp;
	boolean active;
	int noofleaves;
	long phnno;
	void display() {
		System.out.println(emid);
		System.out.println(age);
		System.out.println(emsal);
		System.out.println(grade);
		System.out.println(exp);
		System.out.println(active);
		System.out.println(noofleaves);
		System.out.println(phnno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 t1 = new Task2();
		t1.emid = 103;
		t1.age = 30;
		t1.emsal = 50000;
		t1.grade = 'A';
		t1.exp = 5;
		t1.active = true;
		t1.noofleaves = 25;
		t1.phnno = 9187354635L ;
		t1.display();
	}

}
