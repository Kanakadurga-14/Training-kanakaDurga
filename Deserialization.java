package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization
{
  public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		FileInputStream FIS= new FileInputStream("F:\\Employee.txt");
		ObjectInputStream OBS= new ObjectInputStream(FIS);
		Object O=OBS.readObject();
		Employee Durga=(Employee)O;
		System.out.println(Durga.id+" "+Durga.name+"  "+Durga.salary);
	}
}