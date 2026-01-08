/****
Program	No.	:03
Program Name	:UserInputExample.java
Author		:Tanavya
Date		:02/07/25
Purpose		:To find years until retirement
****/

import java.util.Scanner;
public class UserInputExample
{
	public static void main(String args[])
	{	
		Scanner console= new Scanner(System.in);
		System.out.print("How old are you ? ");
		int age= console.nextInt();
		int years=65-age;
		System.out.print("Years until retirement is: " + years);
	}
}