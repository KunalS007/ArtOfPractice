package InterviewProgram;

import org.testng.annotations.Test;

public class StringCountSequence 
{
	@Test
	public void countString()
	{
		String name = "AAB CKBuKnal Shah";
		String result = "";
		
		name = name.toLowerCase();
		int count;
		
		System.out.println(name);
		
		for(int i=0;i<name.length();i++)
		{
			count = 1;
			
		
			if(name.charAt(i)== ' ')
			{
				continue;
			}
			for(int j= i+1; j<name.length();j++)
			{
				if(name.charAt(i) == name.charAt(j))
				{
					count++;
				}
			}
			
			boolean alreadyPrinted = false;
			for(int k = 0; k<i; k++)
			{
				if(name.charAt(i) == name.charAt(k))
				{
					alreadyPrinted = true;
					break;
				}
			}
			
			if(!alreadyPrinted)
			{
				System.out.println(name.charAt(i) + " = " + count);
			}
		}
	}
}

