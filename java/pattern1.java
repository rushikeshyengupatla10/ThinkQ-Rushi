package patternAssignment;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i= 5; i>= 1; i--)
		    {
		    for (int j=5; j>i;j--)
		    {
		    System.out.print(" ");
		    }
		    for (int k=1;k<=i;k++)
		    {
		    System.out.print("*");
		    }
		    System.out.println("");
		    }
}

}