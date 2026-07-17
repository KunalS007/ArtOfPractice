package test;

class Emp
{
	int salary;
	String name;

	public int getSalary()
	{
		
		return salary;
	}

	public String getName()
	{
		return  name;
	}
	
	public void setName()
	{
		//name=n;
		System.out.println("The Salary is:");
	}
}

class Cellphone
{
	public void Ring()
	{
		System.out.println("Phone is Ringing");
	}
	
	public void Vibrat()
	{
		System.out.println("Phone is Vibrating");
	}
}
public class Custom_class {

	public static void main(String[] args) {
		
		Emp em =new Emp();
		em.setName();
		em.salary=5000;
		em.name="Kunal";
		System.out.println("Salary is:" +em.getSalary()); 
		System.out.println("Name is:" +em.getName());

		Cellphone cp =new Cellphone();
		cp.Ring();
		
		cp.Vibrat();
		
	}
}
