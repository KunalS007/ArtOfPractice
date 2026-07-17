package test.Kunal;

class Mythr1 extends Thread
{
	public void run()
	{
		int i=0;
		while(true)
		{
			System.out.println("Thank you");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			i++;
		}
	}
}

class Mythre2 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good Bye");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}

public class Join_Thread {

	public static void main(String[] args) 
	{
		Mythr1 obj1 = new Mythr1();
		Mythre2 obj2 = new Mythre2();
		
		obj1.start();
		
		Mythr1 p1 = new Mythr1();
		System.out.println(p1.getPriority());
		System.out.println(p1.getState()); // 
		System.out.println(Thread.currentThread().getState());  //current state of thread
		/*	try
		{
			obj1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		obj2.start();
	}

}
