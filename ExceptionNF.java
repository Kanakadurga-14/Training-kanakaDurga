package example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNF
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		try 
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter the number");
			id=Integer.parseInt(Sc.next());
		}
		catch(NumberFormatException Nf)
		{
			
			System.out.println("number format exception");
		
		}
		catch(InputMismatchException Im)
		{
			Im.printStackTrace();
			System.out.println("Input mismatch exception");
	}
		catch(ArithmeticException Ae)
		{
		System.out.println(" arthimetic exception is handled");
		System.out.println("exception is handled");
	}
}
}
