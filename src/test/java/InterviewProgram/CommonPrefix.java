package InterviewProgram;

import org.testng.annotations.Test;

public class CommonPrefix 
{
	@Test
	public void prefix()
	{
		/*
		 * 	Think of indexOf() like this:
			It returns:

			0 → found at beginning
			2 → found at position 2
			5 → found at position 5
			-1 → not found at all
		 * 
		 */
		
		String str[] = {"flower", "fly", "flight"};
		String prefix = str[0];
		//System.out.println(prefix);
		
		
		for(int i=1; i<str.length;i++)
		{
			while(str[i].indexOf(prefix) != 0)
				/*
				 * 	indexOf(prefix) != 0
					means:👉 Prefix is NOT found at starting position.
					Because:
					0 means found at beginning
					-1 means not found
				 * 
				 */
				{
					prefix = prefix.substring(0,prefix.length()-1);
				}
		}
		System.out.println("Common prefix is: " + prefix);
	}
}
