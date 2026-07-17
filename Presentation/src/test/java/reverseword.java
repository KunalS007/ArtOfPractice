
public class reverseword {

	public static void main(String[] args) 
	{
		
		String input ="Kunal Shah";
		//String[] words = input.split(" ");
		String result = "";
	
		for(int i = input.length()-1; i>=0; i--)
		{
			result += input.charAt(i);
		}
		
		System.out.println(result);
	}

}
