abstract class Engineersubj
{
  abstract void firstyearsub();
  
  abstract void thirdyearsub();
}
 class NestedclassusingAbstract
{
public static void main(String args[])
{
Engineersubj sub =new Engineersubj()
{
  void firstyearsub()
{
System.out.println(" maths and english");
}
 void thirdyearsub()
{
System.out.println(" java and web development");
}
};
System.out.println(sub);
sub.firstyearsub();
sub.thirdyearsub();
}
}