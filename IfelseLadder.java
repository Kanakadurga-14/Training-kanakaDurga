package example;

import java.util.Scanner;

public class IfelseLadder
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter number 2: ");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter number 3: ");
		num3 = Integer.parseInt(sc.nextLine());
		if(num1>num2&&num1>num3)
		{
			System.out.println("num1 is maximum");
		}
		else if(num2>num3)
		{
			System.out.println("num2 is maximum");
		}
		else 
		{
			System.out.println("num3 is maximum");
		}

	}
}

