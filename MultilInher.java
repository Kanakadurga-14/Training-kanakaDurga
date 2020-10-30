 class Dayone
{
public void aptitude()
{
System.out.println("  Answer the all  the   sections");
}
}
class Daytwo extends Dayone
{
public void  techni1()
{
System.out.println(" explain the concepts with example");
}
public void techni2()
{
System.out.println(" write the code for programs  ");
}
}
class Daythree extends Daytwo
{
public void hr()
{
System.out.println("   good communcation skilss    "); 
}
}
class MultilInher
{
public static void main(String args[])
{
Daythree D3 =new Daythree();
 D3.aptitude();
  D3. techni1()
 D3.hr();
}
}
