package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
  
class Employee implements Serializable
{
  int id;
  String name;
  int salary;
public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
  }
public class SeriaExamp
{
public static void main(String[] args) throws IOException 
{
	Employee Durga=new Employee(514,"vani",20000);
	FileOutputStream fo=new FileOutputStream("F:\\Employee.txt");
	ObjectOutputStream OTS= new ObjectOutputStream(fo);
	OTS.writeObject(Durga);
	OTS.flush();
	OTS.close();
	}
}
	
