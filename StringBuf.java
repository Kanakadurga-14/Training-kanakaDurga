package example;

public class StringBuf {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
StringBuffer SB= new 	StringBuffer("core java");
System.out.println("SB="+SB);

StringBuffer SB2=SB;
SB.append("testing");
System.out.println(SB);
System.out.println(SB2);
StringBuilder Builder= new 	StringBuilder("janaki");
StringBuilder Builder2= new StringBuilder("madhu");

System.out.println(Builder.equals(Builder2));
System.out.println(Builder.toString());
}
}