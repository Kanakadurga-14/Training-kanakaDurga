class Paymentapp
{
public void pay()
{
System.out.println("  Transfer the money ");
}
}
class Googlepay extends Paymentapp
{
public void  recharge()
{
System.out.println("recharge the mobile through googlepay ");
}
}
class Phonepay extends Googlepay
{
public void Electricitybill()
{
System.out.println("  Electricitybill through  Phonepay    "); 
}
}
class Amazonpay extends Phonepay
{
public void  shoppbill()
{
System.out.println(" shop the  amazon and pay through the  amazonpay");
}
}
class HieraInexample
{
public static void main(String args[])
{
 Amazonpay amazon =new Amazonpay();
  amazon.shoppbill();
  amazon.Electricitybill();
}
}