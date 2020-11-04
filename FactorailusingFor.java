package example;

public class FactorailusingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int sum=0;int n=123,rem=0;
 for(;n>0;)
 {  
	 rem=n%10;
	 sum=sum+rem;
	 n=n/10;
	 
	}
	System.out.println("sum="+sum);
   }
}

