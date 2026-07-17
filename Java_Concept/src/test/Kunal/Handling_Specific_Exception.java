package test.Kunal;

import java.util.Scanner;

public class Handling_Specific_Exception {

	public static void main(String[] args) 
	{
		int [] marks = new int[3];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Pelase enter number");
		int ind = sc.nextInt();
		
		System.out.println("Enter the number divide by");
		int number =sc.nextInt();
		
		try
		{
			System.out.println("value of index" +marks[ind]);
			System.out.println("value of index" +marks[ind]/number);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred ");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception occurred ");
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occurred ");
		}
	}
}
