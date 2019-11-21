package assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Al_9 {

	public static void main(String[] args) {
	 ArrayList ar1 = new ArrayList();
	 ar1.add("one");
	 ar1.add("two");
	 ar1.add("three");
	 
	 ArrayList ar2 = new ArrayList();
	 ar2.add("1");
	 ar2.add("2");
	 ar2.add("3");
	 
	 Collections.copy(ar2,ar1);
	 
	 System.out.println(ar2);

	}

}
