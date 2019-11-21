package assignment1;

import java.util.ArrayList;

public class Al_7 {

	public static void main(String[] args) {
		
		ArrayList<String> ar =new ArrayList<String>();
        ar.add("anu");
        ar.add("akash");
        ar.add("chukki");
        
       Boolean b1 = ar.contains("akash");
       
      if(b1==true)
      {
    	  System.out.println("element is found");
      }
      else
    	  System.out.println("element is notfound");
	}

}
