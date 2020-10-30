interface Rocket
{
 void fly();
 void moveonroad();
}
  class Car implements Rocket
{
 public void moveonroad()
{
System.out.println(" move on the road");
}
public void fly()
{
System.out.println(" fly on the sky");
}
}
class InterfRocket
{
public static void main(String args[])
{
Rocket swift =new Car();
swift.moveonroad();

}
}