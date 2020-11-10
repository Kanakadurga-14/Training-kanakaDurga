package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExam {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub

try
{
	FileOutputStream FWriter= new FileOutputStream("F:\\files.txt");
	String data="Happy diwali";
	 FWriter.write(data.getBytes());
	FWriter.close();
}
catch(IOException E)
{
	E.printStackTrace();
}
	}
}

