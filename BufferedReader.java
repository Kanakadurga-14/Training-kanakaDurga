package files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class BufferedReader {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try
		{
			FileInputStream FReader= new FileInputStream("F:\\files.txt");
			 BufferedInputStream BReader = new BufferedInputStream(FReader);
			 int a=BReader.read();
			 while(a!=-1)
				{
					System.out.print((char)a);
					BReader.available();
					BReader.read();
					 
					 BReader.close();
					
			}
		}
			catch(IOException E)
			{
				E.printStackTrace();
			}	
	}	
	}