import java.util.Scanner;
class Airconditioner
{
 String Type_of_Airconditioner;
 static String Brand_name;
 double price;
 String colour;
  static int Star_ratings;
  static float Capacity;
  int Maxtemperature_range;
  String Condenser_coil;
   static String Operation;
   int Warranty;
}
class RoomAc
{
public static void main(String args[])
{
Airconditioner AC =new Airconditioner();
Scanner Sc = new Scanner(System.in);
AC.Type_of_Airconditioner=Sc.next();
Airconditioner.Brand_name=Sc.next();
AC.price=Sc.nextDouble();
AC.colour=Sc.next();
Airconditioner.Star_ratings=Sc.nextInt();
AC.Maxtemperature_range=Sc.nextInt();
AC.Capacity=Sc.nextFloat();
AC.Condenser_coil=Sc.next();
Airconditioner.Operation=Sc.next();
AC.Warranty=Sc.nextInt();
System.out.println("----------The Airconditioner Detalis are-------");
System.out.println("Type_of_Airconditioner="+AC.Type_of_Airconditioner);
System.out.println("Brand_name="+Airconditioner.Brand_name);
System.out.println("price="+AC.price);
System.out.println("colour="+AC.colour);
System.out.println("Star_ratings="+Airconditioner.Star_ratings);
System.out.println("Maxtemperature_range="+AC.Maxtemperature_range);
System.out.println("Capacity="+AC.Capacity);
System.out.println("Condenser_coil="+AC.Condenser_coil);
System.out.println("Operation="+Airconditioner.Operation);
System.out.println("Warranty="+AC.Warranty);
}
}



 