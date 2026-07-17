package SyncProject.Presentation;

import java.util.Scanner;

import org.testng.annotations.Test;

public class rr {

	//@Test
	public void count()
	{
		int array [] = {530,100,230,5,440};
		int max = 0;
		
		System.out.println(array.length);
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println(+max);
		
	}

	//@Test
	public void fibo()
	{
		int a=0;
		int b=1;
		int c=0;
		int count = 5;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=count; i++)
		{
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}	
	}
	
	
	//@Test
	public void prime()
	{
		int count = 10;
		
		for(int i =2; i<=count; i++)
		{
			boolean isPrime = true;
			for(int j =2; j<i; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				System.out.println(i);
			}
		}
	}
	
	
}
