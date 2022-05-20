package Pratice;

import java.util.Scanner;

public class NumberCheckScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want to check..");
      int num=sc.nextInt();
      
      if(num <0)
    	  System.out.println(num +"its num");
      else
    	  System.out.println(num +"is negative number");
	}

}
