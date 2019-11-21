package assignment_a1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList<String> ar = new LinkedList<String>();
		ar.add("Rudresh");
		ar.add("mahadev");
		ar.add("Rudresh");
		ar.add("");
		ar.add("prithvi");
		ar.add("avinash");
		
		//to append the specified element to the end of a linked list.
		ar.add(ar.size(),"sunny");
		System.out.println(ar);
		
		//to iterate through all elements in a linked list
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

		//to iterate through all elements in a linked list starting at the specified position
		System.out.println("to start iterate linked list starting at the specified position");
		Iterator it1 = ar.listIterator(2);
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		//to iterate a linked list in reverse order.
		System.out.println("to iterate a linked list in reverse order.");
		ListIterator it2 = ar.listIterator(ar.size());
		while(it2.hasPrevious())
		{
			System.out.println(it2.previous());
		}
        
		//to insert the specified element at the specified position in the linked list.
		System.out.println("to insert the specified element at the specified position in the linked list.");
		ar.add(2,"abhi");
        System.out.println(ar);
        
        //to insert the specified element at the front of a linked list.
        System.out.println("to insert the specified element at the front of a linked list.");
        ar.addFirst("anu");
        System.out.println(ar);
        
        //to insert the specified element at the end of a linked list.
        System.out.println("to insert the specified element at the end of a linked list.");
        ar.addLast("jeevan");
        System.out.println(ar);
        
        //to display the elements and their positions in a linked list
        System.out.println("to display the elements and their positions in a linked list");
        for(int i=0;i<ar.size();i++)
        {
        	System.out.println(ar.get(i)+"-----"+i);
        }
        
        //to remove first and last element from a linked list.
        System.out.println("to remove first and last element from a linked list.");
        ar.removeFirst();
        ar.removeLast();
        System.out.println(ar);
        
        //to remove all the elements from a linked list.
      System.out.println("to remove all the elements from a linked list.");
      ar.clear();
      System.out.println(ar);
      
      //to join two linked lists.
        System.out.println("to join two linked lists.");
        LinkedList ls = new LinkedList();
        ls.add("1");
        ls.add("2");
        ls.add("3");
        ar.addAll(ls);
        System.out.println(ar);
       
        //to clone an linked list to another linked list.
        System.out.println("to clone an linked list to another linked list.");
        LinkedList ls1 = new LinkedList();
        ls1 = (LinkedList) ar.clone();
        System.out.println(ls1);
        
        //to remove and return the first element of a linked list.
        System.out.println("to remove and return the first element of a linked list.");
        System.out.println(ar.removeFirst());
        
        //to retrieve but does not remove, the first element of a linked list.
        System.out.println("to retrieve but does not remove, the first element of a linked list.");
        System.out.println(ar.getFirst());
        
        //to check if a particular element exists in a linked list.
        System.out.println("to check if a particular element exists in a linked list.");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to be checked");
        String a1 = sc.next();
        System.out.println(ar.contains(a1));
        
        //to convert a linked list to array list.
        System.out.println("to convert a linked list to array list.");
        ArrayList ar1 = new ArrayList(ls1);
        System.out.println(ar1);
        
        
        
        
        
}
}
