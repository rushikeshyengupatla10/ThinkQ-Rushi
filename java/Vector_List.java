package Pratice;

import java.util.*;

public class Vector_List {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("Rushikesh");
	    v.add(758);
	    v.add(60.82);
	    v.add('t');
	    
	    System.out.println(v);
	    Iterator it = v.iterator();
	    while(it.hasNext())
	    {
	    	Object ob = it.next();
	    	System.out.println(ob);
	    }
	    /*Vector v1 = new Vector(v);
	    v1.add("rushikesh");
	    Iterator it1 = v1.iterator();
	    while(it1.hasNext())
	    {
	    	Object ob1 = it1.next();
	    	System.out.println(ob1);
	    }*/

	}

}