/****
Program	No.	:05
Program Name	:CountName.java
Author		:Tanavya
Date		:02/07/25
Purpose		:To count the number of characters
****/



import java.util.Scanner;
public class CountName 
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		// count no. of characters in a string
		int count = name.length();
		
		// display no. of characters
		System.out.printf("Your name: %5s & Total lenght: %d",name,count);
	}

}