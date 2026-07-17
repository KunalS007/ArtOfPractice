package test;

interface Mobile
{
	void call();
	//Default interface must have body
	default void qwvideo()
	{
		System.out.println("$k video...");
	}
}

interface Smartphone
{
	void receive();
	void notreceive();
}

class Test
{
	public void call()
	{
		System.out.println("This is Call");
	}
}

class Testing extends Test implements Mobile, Smartphone
{
	public void receive()
	{
		System.out.println("Call is Receive now....");
	}
	
	public void notreceive()
	{
		System.out.println("Call is not Receive...");
	}
	
	/*public void qwvideo()
	{
		System.out.println("4K qewweVideo...");
	}*/
}
public class Default_Interface {

	public static void main(String[] args) 
	{
		Testing obj = new Testing();  
		
		obj.call();
		obj.receive();
		obj.notreceive();
		obj.qwvideo();
	}

}
