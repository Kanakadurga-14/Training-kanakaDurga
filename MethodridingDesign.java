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

class CarFactory
{
 Car getCar(String Carname)
{
if(Carname.equals("Audi"))
return new Audi();
else if(Carname.equals("Swift"))
return new Swift();
else return null;
}
}
class MethodridingDesign
{
public static void main(String args[])
{
CarFactory Carf  =new CarFactory();
Car Black=Carf.getCar("Swift");
Black.Cost();
Black.milage();

}
}
