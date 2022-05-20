class Factorial_n
{
public static void main(String args[])
{
java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.println("enter the number ");

	int n =sc.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println("the fact of "+n+"is"+fact)
}

}