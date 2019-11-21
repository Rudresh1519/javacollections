package assignment1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Al_2 {

	public static void main(String[] args) {
		
	 ArrayList<String> ar =new ArrayList<String>();
	 ar.add("Rudresh");
	 ar.add("prithivi");
	 ar.add("mahadev");
	 
	 ListIterator ls = ar.listIterator(ar.size());
	 while(ls.hasPrevious())
	 {
		 System.out.println(ls.previous());
	 }
	 System.out.println("using for loop");
	 for(int i=0;i<ar.size();i++)
	 {
		 System.out.println(ar.get(i));
	 }

	}

}
