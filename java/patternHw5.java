package patternAssignment;

public class patternHw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=4; i++)
		{
			for(int j=4;j>=i;j--)
			{
			System.out.print(" 0");	
			}
			for(int k=1;k<=i+1;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
