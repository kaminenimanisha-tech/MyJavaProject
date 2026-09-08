package com.myfirstnewjava;

public class Test1 {

	
			protected void finalize() throws Throwable{
				super.finalize();
			}	
			

			public static void main(String[] args) { 
				System.out.println("main method started");
				Test1 t1 = new Test1();
				Test1 t2 = new Test1();
				Test1 t3 = new Test1();
				System.out.println(t1);
				System.out.println(t2);
				System.out.println(t3);
				t1 = null;
				System.gc();
			// TODO Auto-generated method stub

			}

		}
	


