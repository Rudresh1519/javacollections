package assignment1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Al_3 {

	public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>();
	ar.add("Rudresh");
	ar.add("prithivi");
	ar.add("neha");
	ar.add("");
	System.out.println(ar);
	
	System.out.println("adding element to first index");
	ar.add(0,"mahadev");
    
	System.out.println(ar);
	
	}

}
