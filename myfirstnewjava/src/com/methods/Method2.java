package com.methods;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentname("Priya","C");
		studentage(18);
		studentheight(5.5f);
		studentweight(45.5);
		studentrollno(118);
		studentmarks(95,99,100,85,75,80);
		studentlocation("Hyderabad");
		
	}
	
	static void studentname(String fn,String ln) {
		System.out.println("FirstName :"+ fn);
		System.out.println("Lastname :"+ ln);
		
	}
	
	static void studentage(int age) {
	System.out.println("Age :"+ age);
	
	}
	
	static void studentheight(float height) {
		System.out.println("Height :" + height);
		
	}
	
	static void studentweight(double weight) {
		System.out.println("weight :"+ weight);
	}
	
	static void studentrollno(int rollno) {
		System.out.println("Rollno :"+ rollno);
		
	}
	
	static void studentmarks(int t,int h,int e,int m,int sc,int so) {
		int sum = t+h+e+m+sc+so;
		System.out.println("SubjectMarks :"+ sum);
		int avg = sum/6;
		System.out.println("AverageMarks :"+avg);
		
	}
	
	static void studentlocation(String locname) {
		System.out.println("Location :"+ locname);
	}
	
	
	
}
