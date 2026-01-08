/*********************************************************
Program No	:07
Program Name	:Customer.java
Author		:Tanavya
Date		:08/07/2025
Purpose		:Implementation of types of variables
*********************************************************/
import java.util.Scanner;
public class Customer
{
	//instance variable
	double customer_bill;

	//static variable
	double total_sale=0;

	public void processBill()
	{
		Scanner console=new Scanner(System.in);
		System.out.print("Enter the number of items:");
		//local variable
		int n=console.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter item name"+i+": ");
			String item_name=console.nextLine();
			console.next();
			System.out.print("Enter item price"+i+": ");
			double item_price=console.nextDouble();
			//local variable
			double discount=0.0;
			if(item_price>500)
				{
					discount=item_price*0.05;
				}
			double final_price=item_price-discount;
			System.out.println("final price of item name:"+item_name+": "+final_price);
			customer_bill+=final_price;
		}//for loop close

         System.out.println("the final customer bill is : "+customer_bill);

	total_sale+=customer_bill;
	
	
	}//processbill method closed

		public static void main(String args[])
			{
				Scanner console=new Scanner(System.in);
				String choice=null;
					do
					{
						Customer obj=new Customer();
						obj.processBill();
						System.out.print("Are you next customer(yes/No)");
						choice=console.next();
					}while(choice.equals("Yes"));
				
				
			}//main method closed
	
   }//class closed







