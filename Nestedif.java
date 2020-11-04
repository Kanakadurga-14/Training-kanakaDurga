package example;

import java.util.Scanner;

public class Nestedif
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
				int enterpin;
				int Storedpin;
				double amount;
				double balance;
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter the pin: ");
				 enterpin= Integer.parseInt(sc.nextLine());

				System.out.print("Enter value of pin : ");
				Storedpin= Integer.parseInt(sc.nextLine());

				System.out.print("Enter amount : ");
				amount= Integer.parseInt(sc.nextLine());
				
				balance= Integer.parseInt(sc.nextLine());
				
				if(enterpin==Storedpin)
				{
			
					if(amount<=balance)
					
						System.out.print("take your money");
					else
				
						System.out.print(" first go to deposit");
				}
			else
						
				{
					
						System.out.print("return back card");
				}
				}
	}