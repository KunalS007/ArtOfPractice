package test;

class Bank
{
	public int RateofInte()
	{
		return 0;
	}
}

class SBI extends Bank
{
	public int RateofInte()
	{
		return(5);
	}
}

class BOB extends Bank
{
	public int RateofInte()
	{
		return(10);
	}
}

class axis extends Bank
{
	public int RateofInte()
	{
		return(15);
	}
}

public class Method_Over {

	public static void main(String[] args) 
	{
		SBI sb= new SBI();
		System.out.println("SBI Rate of Interest: "+sb.RateofInte());
		
		BOB bi = new BOB();
		System.out.println("BOB Rate of Interest: "+bi.RateofInte());
		
		axis ax = new axis();
		System.out.println("Axis Rate of Ineterest: "+ax.RateofInte());
		
	}

}
