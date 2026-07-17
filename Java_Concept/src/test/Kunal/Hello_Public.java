package test.Kunal;

class Y1
{
	public int a=10;
	private int b=20;
	int c=30;
	protected int d = 40;
	
	public void me1()				// Public access modifier .. you have to create a one method and call that in main class
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}


public class Hello_Public 
{
	public static void main(String[] args) 
	{
		Y1 obj = new Y1();
		obj.me1();
		/*System.out.println("Public number "+obj.a);
		System.out.println("Private number "+obj.b);  // Private access modifier ...private varibale intialize in main class
		System.out.println("Default number "+obj.c);
		System.out.println("Proteced number "+obj.d);
		*/
	}

}
