package test;

public class APIt {

int num1;
int num2;
int sum;

public void test()
{
	sum=num1+num2;
	
}

public static void main(String[] args)
{
	APIt obj =new APIt();
	obj.num1=3;
	obj.num2=4;
	obj.test();
	
	System.out.println("Sum is " +obj.sum);
	
	
}
}