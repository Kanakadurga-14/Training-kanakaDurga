package example;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
int num;
Scanner Sc= new  Scanner(System.in);
System.out.print("Enter any number : ");
num = Integer.parseInt(Sc.nextLine());

if(num>0)
	System.out.print( "num is Positive.");
else
	System.out.print("  num is Negative.");

	}

}
