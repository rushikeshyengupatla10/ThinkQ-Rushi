package patternAssignment;

public class patternHw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5;j++)
			{
				if(i==j||i==1&&j==5||i==5&&j==1||i==4&&j==2||i==2&&j==4)
					System.out.print("x");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
