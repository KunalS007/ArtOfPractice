package test;

class AJ
{
	public int x=50;
	protected int y=100;
	int z=200;
	private int a=300;
	
	public void meth1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
	}
}


public class Access_modifier {

	public static void main(String[] args) 
	{
		AJ obj = new AJ();
		obj.meth1();		
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		//System.out.println(obj.a);  // Private - access modifier
	}

}
