import java.util.Scanner;
class Message
{ 
 
public void gmail()
{
System.out.println("Type the message through hanouts");
}
}
class Videocall extends Message
{
String videocallname;
public void facebook()
{
System.out.println("call the video through messenger");
}
}
class SinInherexam
{
public static void main(String args[])
{

Videocall  Hello =new Videocall();
Scanner Sc = new Scanner(System.in);
Hello.videocallname=Sc.next();
    Hello.facebook();
 Hello.gmail();
}
}