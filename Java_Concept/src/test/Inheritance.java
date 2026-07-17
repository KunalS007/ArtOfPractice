package test;

class Base
{
	int x;
	
	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public void display()
	{
		System.out.println("Base class");
	}
}

class Derived extends Base
{
	int y;

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}
	
	public void display1()
	{
		System.out.println("Derived class");
	}
}

public class Inheritance {

	public static void main(String[] args) 
	{
		Base b =new Base();
		b.setX(45);
		System.out.println(b.getX());
		
		Derived d = new Derived();
		d.setY(74);
		System.out.println(d.getY());

	}	
}



