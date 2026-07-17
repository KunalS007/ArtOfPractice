package test;

class base
{
	base()
	{
		System.out.println("This is base constructor");
	}
	
	base(int x)
	{
		System.out.println("This is base overloaded constructor with value X: " +x);
	}
}

class derived extends base
{
	derived()
	{
		System.out.println("This is derived constructor");
	}
	
	derived(int x,int y)
	{
		super(x);
		System.out.println("This is derived overloaded constructor with value Y: " +y);
	}
}

class child extends derived
{
	child()
	{
		System.out.println("This is child constructor");
	}
	
	child(int x,int y, int z)
	{
		super(x,y);
		System.out.println("This is child overloaded constructor with value Z:" +z);
	}
}
public class Constructor_In_Inheritance {

	public static void main(String[] args) 
		{
			child c1=new child(10,20,30);
		}

}		



