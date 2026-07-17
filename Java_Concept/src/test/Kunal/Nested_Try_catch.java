package test.Kunal;

import java.util.Scanner;

public class Nested_Try_catch 
{

	public static void main(String[] args) 
	{
		int [] marks = new int[3];
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{ 
		System.out.println("Please enter index number:");
		int ind = sc.nextInt();
		try
		{
			System.out.println("welcome - JAVA");
			try
			{
				System.out.println(marks[ind]);
				flag= false;
			}
		
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Sorry this index out of bound");
				System.out.println("Exception level 2:");
			}
		}
		catch(Exception e)
			{
				System.out.println("Exception level 1:");
			}
	
		}
		System.out.println("Thanks for using this programe");
	}
}