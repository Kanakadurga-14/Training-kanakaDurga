package example;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the first number:");
	int a=Sc.nextInt();
	System.out.println("a="+a);
	System.out.println("enter the second number:");
	int b=Sc.nextInt();
	System.out.println("b="+b);
	int result=a/b;
System.out.println("result="+result);
}
catch(ArithmeticException Ae)
{
	Ae.printStackTrace();
	System.out.println("exception is handled");
}
	}

}
