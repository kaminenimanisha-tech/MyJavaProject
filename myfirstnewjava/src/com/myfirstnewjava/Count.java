
package com.myfirstnewjava;

public class Count {


		static int count;{
			count ++;
		}
		public static void main (String[] args) {
			Count c1 = new Count ();
			Count c2 = new Count ();
			Count c3 = new Count ();
			Count c4 = new Count ();
			Count c5 = new Count ();
			
		// TODO Auto-generated method stub
			System.out.println("number of objects created are :" +count);
	}

}