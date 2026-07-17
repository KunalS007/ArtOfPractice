package test;

public class Static_variable {

	int num1;
	String name;
	static String collage="IIM";
	
	Static_variable(int a, String name)
	{
		num1 =a;
		this.name =name;
	}
	void display()
	{
		System.out.println(num1+ " " +name+ " " +collage);
	}


	public static void main(String[] args) 
	{
		Static_variable obj1 = new Static_variable(111,"kunal");
		Static_variable obj2 = new Static_variable(222,"Shah");
		obj1.display();
		obj2.display();
	}

}
