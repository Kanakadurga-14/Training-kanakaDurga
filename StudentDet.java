import java.util.Scanner;
class Student
{
 int  Student_id;
 Float Student_percentage;
 static String college;
}
class Employee
{
 int  Employee_id;
 int Employee_salary;
 static String company_name;
}
  
class StudentDet 
{
public static void main(String args[])
{
Student Durga=new Student();
Scanner Sc = new Scanner(System.in);
Durga.Student_id=Sc.nextInt();
Durga.Student_percentage=Sc.nextFloat();
Student.college=Sc.next();
System.out.println("----------The Student Detalis are---------");
System.out.println("Student_id=" +Durga.Student_id);
System.out.println("Student_percentage="+Durga.Student_percentage);
System.out.println("college="+Student.college);
Employee kanakadurga=new Employee();
kanakadurga.Employee_id=2020;
kanakadurga.Employee_salary=20000;
Employee.company_name="JNIT Technology";
System.out.println("----------The Employee Detalis are---------");
System.out.println("Employee_id="+kanakadurga.Employee_id);
System.out.println("Employee_salary="+kanakadurga.Employee_salary);
System.out.println("company_name="+Employee.company_name);

}
}
