package Test123;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListCollection {

public static void main(String[] args) {
		
	
ArrayList a = new ArrayList(); // we can craete object of array list
        a.add(520);
        a.add("vyankatesh");
        a.add('v');
        a.add(55.166);
        a.set(0,"mee");
      //a.remove(0)// to remove particular
     // a.clear();// for delete all 
        System.out.println(a.get(2));
	    for (int i=0;i<a.size();i++) {
	    System.out.println(a.get(i)); 
	// we cant not find value of particular index 
	// to find the index one by one in array list 
	// with the help of (.get) method
	}
	}
}
