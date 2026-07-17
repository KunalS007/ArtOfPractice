package test;

public class Fibonacci {

	static int fibo(int n)
	{
		if(n==1 || n==2)
		{
			return n-1;
		}
		
		else
		{
			return fibo(n-1)+ fibo(n-2); //2 +1
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("The number is:" +fibo(5));
		
	}

}

