package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String[] array = {"hari","shashi","tushar","rahul"};
		for(String s : array)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		List<String> lst = new ArrayList(Arrays.asList(array));
        lst.add("Rahul");
        System.out.println(lst);
	}
}