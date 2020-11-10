package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWriter
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			
		FileOutputStream Fwriter = new FileOutputStream("F:\\\\files.txt");  
	    BufferedOutputStream BWriter = new BufferedOutputStream(Fwriter); 
	    String data="Happy diwali to all";
	    BWriter.write(data.getBytes());
	    BWriter.flush(); //flush method is used to transfer the data present in stream into file
	    BWriter.close();   
	}
	catch(IOException E)
	{
		E.printStackTrace();
	}
		}
}
