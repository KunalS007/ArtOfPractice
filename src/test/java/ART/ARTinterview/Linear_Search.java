package ART.ARTinterview;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Linear_Search 
{
	@Test
	public void oneProgram()
	{
		int[] numbers = {100,200,300,50,250};
		int target = 50;
		boolean found = false;
		
		for(int i=1; i<numbers.length; i++)
		{
			if(target == numbers[i])
			{
				System.out.println("Exact Numbers Found: " +numbers[i]+ " at index " + i); 
				found = true;
				break;
			}
			
			if(!found)
			{
				System.out.println("Exact Number Not Found");
			}
		}
		
	}
	
}
