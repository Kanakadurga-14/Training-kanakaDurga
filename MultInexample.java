class Electronics
{
public void mobile()
{
System.out.println(" mobile price is 20 thousand ");
}
}
class Laptop extends Electronics
{
public void dell()
{
System.out.println(" dell laptop price is 32 thousand");
}
public void hp()
{
System.out.println(" hp laptop price is 40 thousand  ");
}
}
class Tablet extends Laptop
{
public void samsang()
{
System.out.println(" samsang tablet price is 15 thousand "); 
}
}
class MultInexample
{
public static void main(String args[])
{
Tablet  T =new Tablet();
 T.dell();
  T.samsang();
}
}
