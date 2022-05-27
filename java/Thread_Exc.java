package Practice;

public class ThreadExecute {

	public static void main(String[] args) {
		
		ThreadCreate tr = new ThreadCreate();
		tr.start();
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println("ch = "+ch);
		}
	}

}