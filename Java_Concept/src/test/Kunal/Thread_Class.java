package test.Kunal;


class Thread1 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<4000)
		{
			System.out.println("Thread 2 is chatting with her");
			System.out.println("I am sad");
			i++;
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		int i=0;
		while(i<4000)
		{
			System.out.println("Thread 1 is chatting with him");
			System.out.println("I am happy");
			i++;
		}
	}
}

public class Thread_Class {

	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		Thread  t2 = new Thread2();
		
		t1.start();   // It will start the thread run method which we create above.
		t2.start();   // It will start the thread run method which we create above.
	}

}
