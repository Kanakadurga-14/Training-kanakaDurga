class Test
{
   static
   {
   System.out.println("this is the static block");
   }
}
  class Java
  {
	  static
	  {
	  System.out.print("java class");
  }
  
Java()
{
System.out.print(" java constructor ");
}
}
    class ForName
   {
	   
	public static void main(String[] args) throws Exception 
{
		// TODO Auto-generated method stub
		   System.out.println("static method");
		  
			Class C=Class.forName("Java");
	         System.out.println("Name of Class  = " + C.getName());  
	        C.newInstance();

		
}
}
 