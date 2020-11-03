class Vehicle
{  
    static class Bike
{
void run()
{
System.out.println(" bike is running on  the road "); 
}
 static void stand()
{
 System.out.println("after bike is drived place the stand properly");
}
} 
}
class NestedclassusingStatic
{
public static void main(String args[])
{  
 Vehicle.Bike Royal=new Vehicle.Bike();
 Royal.run();
 Vehicle.Bike.stand();
}
}