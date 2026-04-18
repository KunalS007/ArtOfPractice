package ART.ARTinterview;

import org.testng.annotations.Test;

public class DuplicateArrayRemove 
{

	@Test
	public void as()
	{
		int arr[] = {12,23,12,4, 56,4};
		
		for(int i = 0; i < arr.length; i++)
		{
			boolean isDuplicate = false; 
			
			for(int j=0; j<i; j++)
			{
				if(arr[i] == arr[j])
				{
					isDuplicate =true;
					break;
				}
			}
			
			if(!isDuplicate)
			{
				System.out.println(arr[i] + " ");
			}
		}
	}
}
