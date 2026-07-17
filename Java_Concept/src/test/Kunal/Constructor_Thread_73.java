package test.Kunal;

class mythread extends Thread
{
	public mythread(String name)
	{
		System.out.println("This is thrad");
	}
}
public class Constructor_Thread_73 {

	public static void main(String[] args) 
	{
		mythread t1 = new mythread("Kunal");
		t1.start();
		System.out.println("Thread t1 ID is: " +t1.getId());
		System.out.println("Thread t1 name  is: " +t1.getName());
	}

}
