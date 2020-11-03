class University
{
void announcement()
{
System.out.println("timetable as been announced");
}
class Department 
{
void computerlab()
{
System.out.println(" excute the programs");
}

}
}
class NestedClassexampl
{
public static void main(String args[])
{
University jntuk = new University();
jntuk.announcement();
University.Department CSE =new University().new Department();
CSE.computerlab();
}
}
