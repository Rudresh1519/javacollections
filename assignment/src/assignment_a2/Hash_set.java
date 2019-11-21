package assignment_a2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		
		//to add student names in a hash set.
		System.out.println("to add student names in a hash set");
		h1.add("anu");
		h1.add("ajay");
		h1.add("karan");
		h1.add(" ");
		h1.add("chirag");
		h1.add("suhas");
		
		//to append the specified element to the end of a hash set
		System.out.println("to append the specified element to the end of a hash set");
		//h1.addLast("jayanth");
		
		//to iterate through all elements in a hash list
		System.out.println("to iterate through all elements in a hash list");
		Iterator it = h1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//to get the number of elements in a hash set
		System.out.println("to get the number of elements in a hash set.");
		System.out.println(h1.size());
		
		//to empty an hash set
		/*System.out.println("to empty an hash set.");
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);*/
		
		//to convert a hash set to an array
		System.out.println("to convert a hash set to an array");
		/*String[] st1= new String[h1.size()];
		h1.toArray(st1);
		for(String temp : st1)
		{
			System.out.println(temp);
		
		}*/
		
		 Object[] arr = h1.toArray(); 
		  
	        System.out.println("The array is:"); 
	        for (int j = 0; j < arr.length; j++) { 
	            System.out.println(arr[j]); }
	        
		// to convert a hash set to a List/ArrayList.
		System.out.println(" to convert a hash set to a List/ArrayList.");
		ArrayList ar =new ArrayList(h1);
		System.out.println(ar);
		
		//to compare two hash set
		System.out.println("to compare two hash set");
		HashSet<String> h2 = new HashSet<String>();
		h2.add("mallesh");
		h2.add("ajay");
		h2.add(" ");
		h2.add("dev");
		
		for(String ele : h1)
		{
			System.out.println(h2.contains(ele) ? "yes" : "no");
		}
		
		//to compare two sets and retain elements which are same on both sets
		System.out.println("to compare two sets and retain elements which are same on both sets");
		h1.retainAll(h2);
		System.out.println(h1);
		
		//to remove all of the elements from a hash set
		System.out.println("to remove all of the elements from a hash set");
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
		

	}

	
	}


