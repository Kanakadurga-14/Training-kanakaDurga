class Employee 
{
 int Employee_id;
String Employee_name;
long Phoneno;
int Salary ;

Employee()
{
Employee_id=514;
Employee_name="janaki";
Phoneno=9573254977L;
Salary=25000;
}
}
class Constructor
{

  public static void main(String args[])
{
Employee Durga=new Employee();
System.out.println("Employee id is ="+Durga.Employee_id);
System.out.println(" Employee name is ="+Durga.Employee_name);
System.out.println(" phonenumber is ="+Durga.Phoneno);
System.out.println(" salary is ="+Durga.Salary);
}
}


