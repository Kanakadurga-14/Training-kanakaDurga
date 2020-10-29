class Chair
{
 int No_of_Chairlegs;
 String Chair_Colour;
 String Chair_Brand;
 String Chair_Type;
 double Chair_price;
Chair()
{
 No_of_Chairlegs=4;
  Chair_Colour="Black";
  Chair_Brand="Italic";
 Chair_Type="Plastic";
  Chair_price=2000;
}
}
class ZeroargConstructor
{
public static void main(String args[])
{
Chair Armchair =new Chair();
System.out.println(" no of Chairlegs="+Armchair.No_of_Chairlegs);
System.out.println("Colour="+Armchair.Chair_Colour);
System.out.println(" Brand="+Armchair. Chair_Brand);
System.out.println("Type="+Armchair.Chair_Type);
System.out.println(" price="+Armchair. Chair_price);
}
}



