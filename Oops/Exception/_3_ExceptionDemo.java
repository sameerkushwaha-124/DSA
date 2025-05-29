package Oops.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class _3_ExceptionDemo
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);

		try
		{
			num=sc.nextInt();
		}

		catch(InputMismatchException e)
		{
			System.out.println("Please enter number");
		}
		sc.close();
	
		System.out.println(num);
		
	}
}

// Output1: javac ExceptionDemo3.java			
//	      java ExceptionDemo3
//          78
//          78


// Output2:			
//	      java ExceptionDemo3
//          Navin
//          Please enter number
//	      0