package Pratice;

import java.util.Iterator;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				List lst = (List) new Array_List();
				lst.add("hari");
				lst.add(200);
				lst.add('D');
				lst.add(20.25);
				
				System.out.println(lst);
				
				Iterator it = lst.iterator();
				while(it.hasNext())
				{
					Object obj = it.next();
					System.out.println(obj);
				}
			
	}

}
