package test;

class Emp12
{
	private int id;
	private String name;
	
	public void setId(int i)
	{
		this.id=i;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	public String getName()
	{
		return name;
	}
}
public class GetterAndSetter {

	public static void main(String[] args) 
	{
		Emp12 em = new Emp12();
		em.setId(777);
		System.out.println(em.getId());
		
		em.setName("Kunal Shah");
		System.out.println(em.getName());
	}

}
