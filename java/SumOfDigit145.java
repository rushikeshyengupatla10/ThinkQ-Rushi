package Pratice;

import java.util.Scanner;

public class SumOfDigit145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num, sum = 0;
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number:");
	        num = sc.nextInt();
	        while(num > 0)
	        {
	            num = num % 10;
	            sum = sum + num;
	            num = num / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
	    }
	}