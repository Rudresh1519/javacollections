package assignment_a3;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
	
		//to create a new tree set, add some random numbers (Integer) and print out the tree set
        System.out.println("to create a new tree set, add some random numbers (Integer) and print out the tree set");
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(10);
		t1.add(20);
		t1.add(30);
		t1.add(3);
		t1.add(2);
		System.out.println(t1);
        
		//to iterate through all elements in a tree set
		Iterator it = t1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//to add all the elements of a specified tree set to another tree set
        System.out.println("to add all the elements of a specified tree set to another tree set");
        TreeSet<Integer> t2 = new TreeSet<Integer>();
        t2.addAll(t1);
        System.out.println(t2);
            
        //to create a reverse order view of the elements contained in a given tree set.
        System.out.println("to create a reverse order view of the elements contained in a given tree set.");
        Iterator it1 = t1.descendingIterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }
       
        //to get the first and last elements in a tree set
        System.out.println("to get the first and last elements in a tree set");
        System.out.println(t1.first());
        System.out.println(t1.last());
        
        //to get the number of elements in a tree 
        System.out.println("to get the number of elements in a tree ");
        System.out.println(t1.size());
        
        //to find the numbers less than 7 in a tree set
        System.out.println("to find the numbers less than 7 in a tree set");
        TreeSet<Integer> t3 = new TreeSet<Integer>();
        t3 = (TreeSet<Integer>) t1.headSet(7);
        Iterator it2 = t3.iterator();
        while(it2.hasNext())
        {
        	System.out.println(it2.next());
        }
        
        //to get the element in a tree set which is greater than or equal to the given element
        System.out.println("to get the element in a tree set which is greater than or equal to the given element");
        System.out.println(t1.ceiling(21));
        	
        //to retrieve and remove the first element of a tree set.
        System.out.println("to retrieve and remove the first element of a tree set.");
        System.out.println(t1);
        System.out.println(t1.pollFirst());
        System.out.println(t1);
        
        //to retrieve and remove the last element of a tree set
        System.out.println("to retrieve and remove the last element of a tree set");
        System.out.println(t1);
        System.out.println(t1.pollLast());
        System.out.println(t1);
        
        //to remove a given element from a tree set
        System.out.println("to remove a given element from a tree set");
        System.out.println(t1);
        System.out.println(t1.remove(3));
        System.out.println(t1);
        
        
        
	}

}
