package test;

public class Varargs {
	
			static void display(String...strings)
			{
				//System.out.println("This is my world");
				for(String s: strings)
				{
					System.out.println(s);
				}
				
			}


	public static void main(String[] args) 
	{
		display();
		display("The Champ is here");
	//	display("is here");
		display("-Kunal");
	}	
}