package test.Kunal;

class MyThreadRunnable1 implements Runnable
{
	@Override
	public void run() 
	{
		int i=0;
		while(i<40)
		{
		System.out.println("This is Thread 1 of Runnable 1 ");
		i++;
		}
	}
}

class MyThreadRunnable2 implements Runnable
{
	@Override
	public void run() 
	{
		int i=0;
		while(i<40)
		{
		System.out.println("This is Thread 2 of Runnable 2");
		i++;
		}
	}
}

public class Runnable_example {

	public static void main(String[] args) 
	{
		MyThreadRunnable1 obj1 = new MyThreadRunnable1();
		Thread thr = new Thread(obj1);
		
		MyThreadRunnable2 obj2 = new MyThreadRunnable2();
		Thread thr1 = new Thread(obj2);
		
		thr.start();
		thr1.start();
	}

}
