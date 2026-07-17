package test;

public class Static_variable1 {
	
	int Rollno;
	String name;
	static String colg="IIM";
	
	Static_variable1(int a, String name)
	{
		Rollno =a;
	    this.name=name;
	}
	
	void display()
	{
		System.out.println(Rollno+ " " +name+ " " +colg+ " ");
	}
	public static void main(String[] args)
	{
		Static_variable1 obj1 = new Static_variable1(111,"Kunal");
		Static_variable1 obj2 = new Static_variable1(555,"Shah");
		
		obj1.display();
		obj2.display();
		
	}
}
