abstract class Student 
{ 
    Student() 
{ 
System.out.println(" student detalis are ");
 } 
    int Student_id=514;
    char classsection='A';
    static  String college="SRK";  
} 
class Employee extends Student
 { 
    int   Employee_id=543;
    int Employee_salary=30000;
 static String company_name="JNIT";
} 
class StudConstruc
 { 
    public static void main(String args[])
 {  
       Employee Durga = new Employee(); 
    System.out.println("Student_id ="+Durga.Student_id);
  System.out.println("class section="+Durga.classsection);
  System.out.println("college="+Student.college);
  System.out.println(" Employee_id="+ Durga.Employee_id);
  System.out.println("Employee_salary="+Durga.Employee_salary);
  System.out.println("company_name="+Employee.company_name);
} 
} 