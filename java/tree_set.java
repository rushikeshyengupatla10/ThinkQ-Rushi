package Practice;
import java.util.*;
public class TreeSet_SortedSet {

	public static void main(String[] args) {
		
        SortedSet s = new TreeSet();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(1);
        System.out.println(s);
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
        	Object obj = itr.next();
        	System.out.println(obj);
        }
	}
}