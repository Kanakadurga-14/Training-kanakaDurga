package example;

import java.io.IOException;

class ExceptionThrow
	{
	  public static void testing() throws IOException
	  {  
	    System.out.println("test the application");
	    throw new ArithmeticException();
	  }

	  public static void main(String args[])
	  {
	    try
	    {
	      testing();
	    }
	    catch(IOException i )
	    {
	      System.out.println("exception handled");
	    i.printStackTrace();
	  }
}
	}