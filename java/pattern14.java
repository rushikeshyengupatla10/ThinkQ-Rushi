package patternAssignment;

public class pattern14 {

	public static void main(String[] args) {
		int j;
		int i;
		// TODO Auto-generated method stub
		for (j = 1; j<= 5; j++)
		{
		for (i = 1; i<= 5; i++)
		{
		System.out.print(" ");
		}
		
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		for (j = 1; j<= 5 - 1; j++)
		{
		for (i = 1; i<= 5; i++)
		{
		System.out.print(" ");
		}
		for (i = 1; i<= 2 * (5 - j) - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
	}

}
