import java.util.Scanner;
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
class MobileExp
{
public static void main(String args[])
{
Xiaomimobile Redmi=new Xiaomimobile();
Scanner Sc = new Scanner(System.in);
Redmi.mobile_name=Sc.next();
Redmi.mobile_price=Sc.nextDouble();
Redmi.mobile_colour=Sc.next();
Xiaomimobile.OS=Sc.next();
Redmi.Memory_RAM=Sc.nextInt();
Xiaomimobile.Rear_Camera=Sc.nextInt();
Xiaomimobile.front_Camera=Sc.nextInt();
Xiaomimobile.protection=Sc.nextDouble();
Xiaomimobile.Battery=Sc.nextInt();
 Xiaomimobile.Display=Sc.nextFloat();
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








 
 