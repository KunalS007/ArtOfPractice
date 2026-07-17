package test;

interface Rame12
{
	public void display12();
	public int sum(int x, int y);
}

interface Rame123
{
	public void display();
	public int mul(int x, int y);
}
class RRum implements Rame12, Rame123
{
	int result;
	int result1;
	public int sum(int x, int y)
	{
		return result= x+y;
	}
	
	public void display12()
	{
		System.out.println("The sum is:" +result);
	}
	
	public int mul(int x, int y)
	{
		return result1= x*y;
	}

	public void display()
	{
		System.out.println("The multiplication is: " +result1);
	}
}

public class Interface {

	public static void main(String[] args) 
	{
		RRum r = new RRum();
		r.sum(50, 50);
		r.display12();
	
		r.mul(50,50);
		r.display();
	}

}
