class Tiffen
{
 void Menu()
{
  System.out.println("1.pulihora 2.dosa 3.poori 4.wada ");
}
void takeOrder(String Order)
{
  System.out.println(" Order is given="+Order);
}
 String ServeFood()
{
   return "poori";
}
 int giveBill()
{
   return 200;
}
 String paybill(int amount)
{
  System.out.println("amount is given="+amount);
   return "paid";
}
}
class Restuarant
{
  public static void main(String args[])
{
Tiffen sweetmagic =new Tiffen();
sweetmagic.Menu();
sweetmagic.takeOrder("poori");
System.out.println("  served food is ="+sweetmagic.ServeFood());
System.out.println(" Bill is ="+sweetmagic.giveBill());
System.out.println(" payed Bill is ="+sweetmagic.paybill(200));
}
}

