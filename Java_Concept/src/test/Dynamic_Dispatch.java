package test;



class phone
{
	public void name()
	{
		System.out.println("This is phone super class");
	}
	
	public void Only()
	{
		System.out.println("This is only method");
	}
}

class smartphone extends phone
{
	public void name()
	{
		System.out.println("This is Smartphone Sub class");
	}
	
	public void two()
	{
		System.out.println("This is two method");
	}
}


public class Dynamic_Dispatch {

	public static void main(String[] args) 
	{
		phone obj = new smartphone();    //super class reference lai n object create karisu sub class
		obj.name();
		obj.Only();
	}

}
