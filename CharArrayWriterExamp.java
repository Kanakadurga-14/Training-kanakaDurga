package files;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterExamp {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		  
		  char[] ch = {'d','u','r','g','a'};
		  try
	   
	      {
	           CharArrayWriter chwriter =new CharArrayWriter();
	           
	           int size= chwriter.size();
	           System.out.println(size);
	         chwriter.write(ch);
	         String Str = chwriter.toString();
	          System.out.print(Str); 
	         
	          chwriter.write(ch, 0, 4); 
	          
	          
	      }
		
	      catch(Exception e)
	      {
	    	  
	          e.printStackTrace();
	}
	}
}
