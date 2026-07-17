package SyncProject.CombinationOfAll;

public class PalindromeCheck 
{
	 public static void main(String[] args) 
	 {
	        String str = "Madam";
	        String cleanText = str.toLowerCase();
	        String reversed = new StringBuilder(cleanText).reverse().toString();
	        if(reversed.equals(cleanText))
			{
				System.out.println(str + " The String is Palindrom");
			}
			else
			{
				System.out.println(str + "The String is not Palindrom");
			}
	 	}
}
