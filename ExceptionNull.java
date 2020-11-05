package example;

public class ExceptionNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="durga";
String name2=null;
try
{
	System.out.println("Length="+name.length());
	System.out.println("Length="+name2.length());
}
catch(NullPointerException Nl)
{
	System.out.println("null pointer exception");
	Nl.printStackTrace();
}
catch(ArithmeticException Ae)
{
System.out.println(" arthimetic exception is handled");
}
finally
{
	System.out.println("finally block is  executed"); 
	System.out.println("Byeee");
	}
	}
}
