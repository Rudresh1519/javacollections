package assignment_a4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_map {

	public static void main(String[] args) {
		
		//to create a HashMap of key as student id(Integer) and value as Student name (String). Add some entries and print the hash map
		System.out.println("to create a HashMap of key as student id(Integer) and value as Student name (String). Add some entries and print the hash map");
		HashMap hm1 = new HashMap();
		hm1.put(1, "vikas");
		hm1.put(2,"james");
		hm1.put(3,"sharan");
		hm1.put(4,"dev");
		hm1.put(5,"akash");
		System.out.println(hm1);

		//to iterate over all the entries in the HashMap
		/*Iterator it = hm1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		System.out.println("to iterate over all the entries in the HashMap");
		for(int i=1;i<=hm1.size();i++)
		{
		System.out.println(hm1.get(i));
		}
		
		//to get the specified value with the specified key in a HashMap
		System.out.println("to get the specified value with the specified key in a HashMap");
		System.out.println(hm1.get(3));
		
		//to count the number of key-value (size) mappings in a map
		System.out.println("to count the number of key-value (size) mappings in a map");
		System.out.println(hm1.size());
		
		//to copy all of the mappings from the specified map to another map
		System.out.println("to copy all of the mappings from the specified map to another map");
		HashMap hm2 = new HashMap();
	    hm2.putAll(hm1);
		System.out.println(hm2);
		
		//to remove all of the mappings from a map
		System.out.println("to remove all of the mappings from a map");
		hm2.clear();
		System.out.println(hm2);
		
		//to test if a map contains a mapping for the specified key
		System.out.println("to test if a map contains a mapping for the specified key");
		System.out.println("check key 1 is present or not");
		if(hm1.containsKey(1))
		{
			System.out.println("yes -" +hm1.get(1));
		}
		
		//to test if a map contains a mapping for the specified value.
		System.out.println("to test if a map contains a mapping for the specified value.");
		System.out.println("check value dev is present or not");
		System.out.println(hm1.containsValue("dev"));
		
		//to get the value of a specified key in a map
		System.out.println("to get the value of a specified key in a map");
		System.out.println("to get value of key 3");
		System.out.println(hm1.get(3));
		
		//to get a set view of the keys contained in this map
		System.out.println("to get a set view of the keys contained in this map");
		/*Set  s1 = hm1.keySet();
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		System.out.println(hm1.keySet());
		
		//to get a collection view of the values contained in this map
		System.out.println("to get a collection view of the values contained in this map");
		System.out.println(hm1.values());
		
		
	}

}
