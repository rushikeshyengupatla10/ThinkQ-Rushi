package Pratice;

import java.util.Scanner;

public class Fibinacissserious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the counter values for series...");
		int count=sc.nextInt();
		int num1=0,num2=1;
		
		for(int i=0;i<count;i++) {
			int temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(temp+" ");
		}
	}

}
