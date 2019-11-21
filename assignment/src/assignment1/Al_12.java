package assignment1;

import java.util.ArrayList;

public class Al_12 {

	public static void main(String[] args) {
		
		ArrayList ar1 = new ArrayList();
		 ar1.add("one");
		 ar1.add("two");
		 ar1.add("three");
		 
		 ArrayList cp = new ArrayList();
		 cp = (ArrayList)ar1.clone();

		 System.out.println(cp);
	}

}
