class  Xiaomimobile
{
   String mobile_name;
   double mobile_price;
  String mobile_colour;
 static String OS;
   int Memory_RAM;
 static int Rear_Camera;
  static int front_Camera;
  static double protection;
  static int Battery;
  static float Display;
 
}
class Variable2
{
public static void main(String args[])
{
Xiaomimobile Redmi=new Xiaomimobile();
Redmi.mobile_name="Note 9 pro";
Redmi.mobile_price=13000.00;
Redmi.mobile_colour="Navyblue";
Xiaomimobile.OS="Android";
Redmi.Memory_RAM=4;
Xiaomimobile.Rear_Camera=48;
Xiaomimobile.front_Camera=16;
Xiaomimobile.protection=3D;
Xiaomimobile.Battery=5020;
 Xiaomimobile.Display=6.67f;
System.out.println("----------The Xiaomimobile Detalis are---------");
System.out.println("mobile_name="+Redmi.mobile_name);
System.out.println("mobile_price="+Redmi.mobile_price);
System.out.println("mobile_colour="+Redmi.mobile_colour);
System.out.println("OS="+Xiaomimobile.OS);
System.out.println("Memory_RAM="+Redmi.Memory_RAM);
System.out.println("Rear_Camera="+Xiaomimobile.Rear_Camera);
System.out.println("front_Camera="+Xiaomimobile.front_Camera);
System.out.println("protection="+Xiaomimobile.protection);
System.out.println("Battery="+Xiaomimobile.Battery);
System.out.println("Display="+Xiaomimobile.Display);

}
}








 
 