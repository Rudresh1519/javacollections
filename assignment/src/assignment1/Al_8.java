package assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Al_8 {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("yathi");
		ar.add("janu");
		ar.add("aanu");
		System.out.println("unsorted ="+ar);
		
		Collections.sort(ar);
        System.out.println("sorted ="+ar);
	}

}
