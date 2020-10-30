abstract class Bike
{  
  abstract void run();
  abstract void stand();
}  
class Honda extends Bike
{  
void run()
{
System.out.println("running bike on the road safely"); 
} 
void stand()
{
 System.out.println("placing the stand properly");
}
}
class Abstrac
{
public static void main(String args[])
{  
 Bike royal = new Honda();  
 royal.run();  
}  
}  