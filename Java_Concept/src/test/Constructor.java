package test;

public class Constructor {

    int num1;
	int num2;
	int sum;
	
	public Constructor()  // default parameter
	{
		num1 = 5;
		num2 = 7;
		sum = num1 + num2;
		System.out.println("The Constructor is:" +sum);
	}

	public Constructor(int a)   //Single parameter
	{
		num1= a;
		System.out.println("constructor:" +num1);
	}
	
	public Constructor(double a1, int b)  //Double parameter
	{
		num1 = (int) a1;
		num2 = b;
	    System.out.println("The number is " +num1 + num2);
	}
	
	public static void main(String[] args)
	{
		Constructor obj1 = new Constructor(50.25,58); //Constructor
		
	
	}
}
