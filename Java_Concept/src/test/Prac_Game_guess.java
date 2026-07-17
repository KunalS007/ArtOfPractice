package test;

import java.util.Random;
import java.util.Scanner;

class Fun
{
	public int number;
	public int inputNumber;
	public int noOfGuss=0;
	
	public int getNoOfGuss() {
		return noOfGuss;
	}

	public void setNoOfGuss(int noOfGuss) {
		this.noOfGuss = noOfGuss;
	}

	Fun()
	{
		Random rm = new Random();
		this.number= rm.nextInt(100);
		
	}

	void takeUserInput()
	{
		System.out.println("Please enter you guess number:");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean isCorrectNumber()
	{
		noOfGuss++;
		if(inputNumber==number)
		{
			System.out.format("Yes, you choose correct number %d and you have attempt %d", number , noOfGuss);
			return true;
		}
		else if(inputNumber<number)
		{
			System.out.println("Too Low...");
		}
		else if(inputNumber>number)
		{
			System.out.println("Too High...");
		}
		return false;
	}
}
public class Prac_Game_guess {

	public static void main(String[] args) 
	{
		Fun f = new Fun();
		boolean b=false;
		while(!b)
		{
			f.takeUserInput();
			b=f.isCorrectNumber();
		}
	}

}
