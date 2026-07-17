package test;

import java.util.Random;
import java.util.Scanner;
 

class Game
{
	public int number;
	public int inputNumber;
	public int noOfGuessses=0;
	
	public int getNoOfGuessses() {
		return noOfGuessses;
	}

	public void setNoOfGuessses(int noOfGuessses) {
		this.noOfGuessses = noOfGuessses;
	}

	Game()
	{
		Random rm = new Random();
		this.number= rm.nextInt(100);
		
	}
	
	void takeUserInput()
	{
		System.out.println("Guess the number: ");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt(); 
	}
	
	boolean isCorrectNumber()
	{
		noOfGuessses++;
		if (inputNumber==number)
		{
			System.out.format("Yes you guessed it right it was %d\n you guessed attempt %d" , number,noOfGuessses);
			return true;
			
		}
		else if(inputNumber<number)
		{
			System.out.println("Too low...");
		}
		else if(inputNumber>number)
		{ 
			System.out.println("Too high...");
		}
		return false;
	}
	
}

public class Game_Guess_Number {

	public static void main(String[] args) 
	{
		Game g = new Game();
		boolean b =false;
		while(!b)
		{
		g.takeUserInput();
		b = g.isCorrectNumber();
		
	}
	}

}
