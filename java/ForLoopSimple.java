package Pratice;

public class ForLoopSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//      for(int i=1;i<=10;i++) 
//      {
//    	 System.out.println(i); 
//      }
		
//		int i =1;
//		while(i<=10)
//		{
//			System.out.println(i*2);
//			
//			i++;
//		}
		
//		int i=1;
//		do
//		{
//			System.out.println(i*6);
//			
//			i++;
//		}
//		while(i<=10);
		
		for(int i=5; i>=0; i--)
		{
			for (int j =1; j<=i; j++)
			{
				System.out.print(j*2);
			}
			
			System.out.println();
		}
		for(int i=2; i<=5; i++)
		{
			for(int j=1 ; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println("*");
		}
}

}
