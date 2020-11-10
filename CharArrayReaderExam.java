package files;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExam 
{

	public static void main(String[] args) throws  IOException   {
		// TODO Auto-generated method stub
		  char[] array = { 'd', 'u', 'r', 'g','a' };  
		    CharArrayReader reader = new CharArrayReader(array);  
		 
		    int i = 0;   
		    while ((i = reader.read()) != -1)
		    {  
		        char ch = (char) i;  
		         
		        System.out.println(ch);  
		    }
		        reader.read(array,1,2);
}
	}

