/****
Program	No.	:07 (1)
Program Name	:SwapUsingTemporary.java
Author		:Tanavya
Date		:02/07/25
Purpose		:To swap two numbers using temporary variable
****/

import java.util.Scanner;
public class SwapUsingTemporary
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		System.out.println("Before Swapping: " + a + " " + b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: " + a + " " + b);
	}
}