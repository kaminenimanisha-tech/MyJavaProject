

package com.myfirstnewjava;

public class Javastudent {

	

		
			
			// static varibles
			static 	String Collegename = "Vcube";
			
			// instance varibles
			String Studentname = "Ram";
			int Studentid = 101;
			int Studentmarks = 95;
			
			public static void main(String[] args) {
				System.out.println("main method started");
				
				// create an object for instance
				Javastudent s1 = new Javastudent();
				System.out.println("Collegename :"+ Collegename);
				System.out.println("Studentname :"+ s1.Studentname);
				System.out.println("Studentid :"+ s1.Studentid);
				System.out.println("Studentmarks :"+ s1.Studentmarks);
				System.out.println("main method ended");
				
				
				
				
				// TODO Auto-generated method stub

			}

		}
	

