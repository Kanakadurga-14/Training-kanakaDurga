class Company
{

    public void detalis(String name,  int id)
   { 
System.out.println("Company Name ="+ name);
  System.out.println("Company Id ="+ id); 
    } 

    public void detalis(int id, String name)
   { 
System.out.println("Company Id ="+ id); 
  System.out.println("Company Name ="+ name);
    } 
} 

class MethodOverloading
{ 
    public static void main (String[] args)
 { 
   Company Jnit  = new Company();
 Jnit.detalis("durga", 514);
  Jnit.detalis("janaki", 510);
    } 
}