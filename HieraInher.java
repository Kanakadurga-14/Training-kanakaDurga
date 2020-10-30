class Animal  
{  
void eat()
{ 
System.out.println("eat the food");
}  
}  
class Dog extends Animal
{  
void boww()
{
System.out.println("boww boww");
}  
}  
class Cat extends Animal
{  
void meow() 
{
System.out.println("meow");
}  
}  
class  HieraInher
{  
public static void main(String args[])
{  
Cat puppy =new Cat();  
puppy.meow();  
puppy.eat(); 
}
} 