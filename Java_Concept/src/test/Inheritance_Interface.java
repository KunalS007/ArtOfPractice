package test;

interface exam
{
	void paper();
}

interface  secondexam extends exam
{
	void maths();
}

class note implements secondexam
{
	public void paper()
	{
		System.out.println("Today is first day of exam...");
	}

	public void maths()
	{
		System.out.println("Today is first paper and it is maths...");
	}
}

public class Inheritance_Interface {

	public static void main(String[] args) 
	{
		note n = new note();
		n.paper();
		n.maths();
	}

}
