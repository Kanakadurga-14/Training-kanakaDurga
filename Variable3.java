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
class Variable3
{
public static void main(String args[])
{
Airconditioner AC =new Airconditioner();
AC.Type_of_Airconditioner="InverterSplitAC";
Airconditioner.Brand_name="Voltas";
AC.price=65000.0;
AC.colour="White";
Airconditioner.Star_ratings=5;
AC.Maxtemperature_range=52;
AC.Capacity=1.5f;
AC.Condenser_coil="Copper";
Airconditioner.Operation="LCD remote";
AC.Warranty=1;
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



 