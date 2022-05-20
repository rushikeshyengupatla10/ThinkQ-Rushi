package prcticepractice;

public class demo {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
			int a= 10 , b =5 , c=2;
			int ans = (c+a)/b;
			System.out.println(ans);
	
	//a= a+5;
			
			a +=5;
	System.out.println("modified valu =" + a);

	int age =4 ;
	char ctz = 'n' ;
	boolean ans1= ((age > 18) || (ctz =='p'));
	
	System.out.println(" decision " + ans1);
	
	int x = 10;
	int y= ++x;
	
 System.out.println( "y = " +y);
 
 System.out.println("x =" + x++);
 
 System.out.println("x ="+ x);
}
}