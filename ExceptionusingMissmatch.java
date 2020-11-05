package example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionusingMissmatch
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter the  number:");
			int a=Sc.nextInt();
			System.out.println("a="+a);
			System.out.println("enter the  b value:");
			int  b=Sc.nextInt();
			System.out.println("b ="+b);
			int result=a/b;
			System.out.println("result="+result);
		}
		catch(InputMismatchException Im)
		{
			System.out.println("Input mismatch exception");
	}
		catch(ArithmeticException Ae)
		{
		System.out.println(" arthimetic exception is handled");
	}

}
}
