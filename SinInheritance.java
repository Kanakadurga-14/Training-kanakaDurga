import java.util.Scanner;
class Whatsapp1
{ 
int no_of_contacts;
public void message()
{
System.out.println("Type the message");
}
}
class Whatsapp2 extends Whatsapp1
{
public void videoCall()
{
System.out.println("call the video call");
}
}
class SinInheritance
{
public static void main(String args[])
{
Whatsapp1 No1=new Whatsapp1();
Scanner Sc = new Scanner(System.in);
No1.no_of_contacts=Sc.nextInt();
No1.message();

Whatsapp2 No2=new Whatsapp2();

No2.videoCall();
}
}