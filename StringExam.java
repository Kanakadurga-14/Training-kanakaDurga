package example;

public class StringExam {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
String s1="KANAKa DUrga";
System.out.println("s1="+s1);
String s2=s1.toUpperCase();
System.out.println("s2="+s2);
String s3=s1.toLowerCase();
System.out.println("s3="+s3);
String s4=s1.substring(4);
System.out.println("s4="+s4);
String s5=s1.substring(3, 5);
System.out.println("s5="+s5);
int s6=s1.hashCode();
System.out.println("s6="+s6);
String St=" intership training on core java ";
String[] Str=St.split(" ");
for(int i=0;i< Str.length;i++)
{
	System.out.println(Str[i]);
}



	}

}
