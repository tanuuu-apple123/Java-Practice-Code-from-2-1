/*********************************************************
Program No	:11
Program Name	:FruitBasketCount.java
Author		:Tanavya
Date		:14/07/2025
Purpose		:implementation of arrays
*********************************************************/
import java.util.Scanner;

public class FruitBasketCount
{
	public void CountFruitBasket()
	{
		Scanner console=new Scanner(System.in);
		System.out.print("Enter the number of basket: ");
		int n=console.nextInt();
		
		//create an array
		int baskets[]=new int[n];
		
		//initialize an array
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter count of apples in Basket "+(i+1)+": ");
			baskets[i]=console.nextInt();
		
		}
		int max=baskets[0];
		int maxindex=0;
		int total=0;

		//accessing an array
		for(int i=0;i<n;i++)
		{
			total+=baskets[i];
			if(max<baskets[i])
			{
				max=baskets[i];
				maxindex=i+1;
			}
			
		}
		System.out.println("total number of apples in all baskets :"+total);
		System.out.println("Maximum number of apple in a Basket :"+max);
		System.out.println("Basket number with highest apples  :"+maxindex);


	}
	public static void main(String args[])
	{
		FruitBasketCount ob=new FruitBasketCount();
		ob.CountFruitBasket();
	}

}









