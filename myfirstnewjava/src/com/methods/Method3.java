package com.methods;

public class Method3 {
	
	void Cricketername(String fullname){
		System.out.println("Cricketername : " + fullname);
	}
	void jerseyno(int jerseyno) {
		System.out.println("Jerseyno : "+ jerseyno);
	}
	void Age(int age) {
		System.out.println("Age : "+ age);
	}
	void Weight(double weight) {
		System.out.println("Weight : " + weight);
	}
	void Height(float height) {
		System.out.println("Height : "+ height);
	}
	void countryname(String countryname) {
		System.out.println("Countryname : " + countryname);
	}
	void Birthdate(String Birthdate) {
		System.out.println("Birthdate : "+ Birthdate);
	}
	void Birthplace(String Birthplace) {
		System.out.println("Birthplace : "+ Birthplace);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 m1 = new Method3();
		m1. Cricketername("Virat Kohli");
		m1.jerseyno(18);
		m1.countryname("India");
		m1.Birthdate("5-November-1988");
		m1.Birthplace("Delhi");
		m1.Age(37);
		m1.Weight(75);
		m1.Height(5.8f);
		
		
		
		

	}

}
