package test;

public class Method_Overloading {

	int num1;
	int num2;
	int sum;
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public void add(double a, double b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Method_Overloading ob1 =new Method_Overloading();
		ob1.add(5,4);
		
		ob1.add(1,2,3);
		
		ob1.add(1.5,5.5,4);
	}

}
