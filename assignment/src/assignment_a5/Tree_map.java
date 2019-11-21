package assignment_a5;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Tree_map{

	public static void main(String[] args) {
		
		//to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student reocrds with random student ids. 
        System.out.println("to create a TreeMap of <studentId(Integer), studentName(String)>. Add some student reocrds with random student ids. ");
        TreeMap t1 =new TreeMap();
        t1.put("11", "orange");
        t1.put("12", "apple");
        t1.put("13", "pine");
        t1.put("14", "kiwi");
        t1.put("15", "guava");
        
        //to get all keys from the given a Tree Map.
        System.out.println("to get all keys from the given a Tree Map.");
        System.out.println(t1);
        
        //to get the first (lowest) key and the last (highest) key currently in a map
        System.out.println("to get the first (lowest) key and the last (highest) key currently in a map");
        System.out.println(t1.firstKey());
        System.out.println(t1.lastKey());
        
      //to get a reverse order view of the keys contained in a given map
        System.out.println("to get a reverse order view of the keys contained in a given map");
        System.out.println(t1.descendingKeySet());
        
      //to delete all elements from a given Tree Map
        System.out.println("to delete all elements from a given Tree Map");
        t1.clear();
        System.out.println(t1);
        
      //to sort keys in Tree Map by using comparator
        System.out.println("to sort keys in Tree Map by using comparator");
        
        SortKeys sk = new SortKeys();
        TreeMap t2 = new TreeMap(sk);
        t2.put(new Student(11,"jeevan"),"jeevan");
        t2.put(new Student(30, "aryan"),"aryan");
        t2.put(new Student(21,"kishan"),"kishan");
        t2.put(new Student(4,"shine"),"shine");
        Set<Student> ks = t2.keySet();
        for(Student key:ks){
            System.out.println(key);
        }
        /*System.out.println(t2);*/
	}
}
	class SortKeys implements Comparator<Student> {
		
		public int compare(Student s1,Student s2)
		{
			if(s1.getId() > s2.getId()){
	            return 1;
	        } else {
	            return -1;
	        }
		}
		
	}

	 class Student {
		
		int id;
		String name;
		public Student(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		
		public int getId() {
	        return id;
	    }
		
		public void setId(int id) {
	        this.id = id;
	    }
		
		public String toString()
		{
			return id+" "+name;
		}
		
	}

