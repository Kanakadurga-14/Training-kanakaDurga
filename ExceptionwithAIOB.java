package example;


import java.util.Scanner;

public class ExceptionwithAIOB
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 int array[] = {20,30,40,50};
	      try
	      {
	         for(int i = 5; i >= 0; i--) 
	         {
	            System.out.println(array[i]);
	         }
	      }
	      catch (ArrayIndexOutOfBoundsException e) 
	      {
	         System.out.println("Array is out of Bounds"+e);
	      } 
	   finally
	{
			System.out.println("finally block is  executed"); 
			System.out.println("Byeee");
			}
}
}