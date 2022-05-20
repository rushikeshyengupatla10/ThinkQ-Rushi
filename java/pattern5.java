package patternAssignment;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a,b;
	        a=6-1;
	        b=1;

	        for(int i=1;i<=6;i++)
	        {
	            for(int k=1;k<=b;k++)
	                System.out.print(k);
	            for(int l=b-1;l>=1;l--)
	                System.out.print(l);
	            System.out.println("*"); 
	            System.out.println("\n");   
	            a--;
	            b++;
	      
	        }
	        
	        a=1;
	        b=6-1;

	        for(int i=6-1;i>=1;i--)
	        {
	        	for(int k=1;k<=b;k++)
	                System.out.print(k);
	            for(int l=b-1;l>=1;l--)
	                System.out.print(l);
	            a++;
	            b--;
	            System.out.println("*"); 
	                    System.out.println("\n");   

	        }
	        System.out.println("*"); 

	}

}
