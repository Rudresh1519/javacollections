package assignment1;

import java.util.ArrayList;

public class Al_11 {

	public static void main(String[] args) {
		
		ArrayList ar1 = new ArrayList();
		 ar1.add("one");
		 ar1.add("two");
		 ar1.add("three");
		 
		 ArrayList ar2 = new ArrayList();
		 ar2.add("1");
		 ar2.add("2");
		 ar2.add("3");
		 
		 //ArrayList a = new ArrayList();
         ar1.addAll(ar2);
         
         System.out.println(ar1);
	}

}
