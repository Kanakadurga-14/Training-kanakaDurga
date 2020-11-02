class Vehicle
{
  void run()
{
System.out.println("Vehicle is running");
}
void flyonSky()
{
System.out.println("Vehicle is flying on sky");
  }
}
  class Bike extends Vehicle
{
  void run()
{
System.out.println("Bike is running on the road");
}
void flyonSky()
{
System.out.println("bike is not flying");
  }
}
class Aeroplane extends Vehicle
{

 void run()
{
System.out.println("aeroplane is  not running on the road");
}
void flyonSky()
{
System.out.println("aeroplane is  flying");
  }
}
class VehicleFactory
{
Vehicle getVehicle(String Vehiclename)
{
if(Vehiclename.equals("Bike"))
return new Bike();
else if(Vehiclename.equals("Aeroplane"))
return new Aeroplane();
else return null;
}
}
class MethodridingDesipatter
{
  public static void main(String args[])
{
VehicleFactory Vehif  =new VehicleFactory();
 Vehicle  V=Vehif.getVehicle(args[0]);
V.run();
V.flyonSky();
}
}