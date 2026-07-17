package test.Kunal;

public class Vowels_count {

	public static void main(String[] args) {
		int number=0;
        int n=0;
        String str= "investis";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                number++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                n++;
            }
        }
        System.out.println("Number of vowels " +number);
        System.out.println("Number of constants " +n);
    }
}




