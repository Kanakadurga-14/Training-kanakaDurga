package files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExamp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			FileInputStream FReader= new FileInputStream("F:\\files.txt");
			int a=FReader.read();//read(): read method reads the 1 character  from the file and returns the unique code of the char
			//if there is no character to read , it returns the -1 hence we have to call the read method multiple times till we get -1
			//
			while(a!=-1)
			{
				System.out.print((char)a);
				a=FReader.read();
			}
		}
		catch(IOException E)
		{
			E.printStackTrace();
		}
			}
		
}

