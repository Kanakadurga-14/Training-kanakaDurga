class Car
{
 void Cost()
{
 System.out.println(" no cost is requried");
}
void milage()
{
  System.out.println(" no milage is requried");
}
}
class Audi extends Car
{
void Cost()
{
 System.out.println("audi cost is 60 lakhs");
}
void milage()
{
  System.out.println(" audi milage is 15km");
}
}
class Swift extends Car
{
void Cost()
{
 System.out.println("swift coat is 40lakhs");
}
void milage()
{
  System.out.println(" Swift milage is 20km");
}
}
class MethodOverriding
{
public static void main(String args[])
{
Car Black =new Car();
Black.Cost();
Black.milage();
Audi White = new Audi();
White.Cost();
White.milage();
Swift Sliver=new Swift();
Sliver.Cost();
Sliver.milage();
}
}
