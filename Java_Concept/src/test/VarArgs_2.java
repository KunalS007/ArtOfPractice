package test;
public class VarArgs_2 {
		
	static int display(int...values)
	{
		int result = 0;
		for(int a:values)
		{
			result +=a;
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("This is sum " +display());
		System.out.println("This is sum " +display(10,20));
		System.out.println("This is sum "+display(10,20,30));
	}

}
