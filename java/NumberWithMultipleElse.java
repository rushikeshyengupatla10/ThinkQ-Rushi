package Pratice;

import java.util.Scanner;

public class NumberWithMultipleElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number u want to check...");
      int num=sc.nextInt();
      
      if(num==0) {
    	  System.out.println(num+" Number is zero");
      }else if(num>0) {
    	  System.out.println(num+" Number is +ve");
      }else
    	  System.out.println(num+" Number is -ve");
	}

}
