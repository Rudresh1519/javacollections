package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Al_4 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Rudresh");
		ar.add("avinash");
		ar.add("divya");
		System.out.println(ar);
		
		System.out.println("enter the index");
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		String s1 = ar.get(i);
		System.out.println(s1);
	}

}
