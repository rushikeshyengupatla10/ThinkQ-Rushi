package patternAssignment;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i = 1; i <= 5; i++) 
	        {
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	              
	            for (int k = i; k <= 5; k++) { 
	            	
	            	System.out.print(k+" "); } 
	            
	            System.out.println(); } 
		 
		 for (int i = 5-1; i >= 1; i--) 
	        {
	             for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	            for (int k = i; k <= 5; k++)
	            {
	                System.out.print(k+" ");
	            }
	              
	            System.out.println();
	        }

	}

}
