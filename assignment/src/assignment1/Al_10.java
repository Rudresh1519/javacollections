package assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Al_10 {

	public static void main(String[] args) {
	
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("yathi");
		ar.add("janu");
		ar.add("aanu");
		System.out.println("given order ="+ar);
        
	    Collections.reverse(ar);
	    System.out.println("reverse order ="+ar);
	}

}
