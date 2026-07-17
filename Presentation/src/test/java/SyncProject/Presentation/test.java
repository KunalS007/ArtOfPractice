package SyncProject.Presentation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class test 
{
	public static String RanPro()
	{
		List<String> ab =  Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg");
		Random ran = new Random();
		int ranIndex = ran.nextInt(ab.size());
		return ab.get(ranIndex);
	}
	
	
	//String reversed using the FOR Loop
	@Test
	public void reversedWithFor()
	{
		String str = "kunal shah";
		String reversed = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			reversed += str.charAt(i);
		}
		System.out.println("The Reversed String: " +reversed);
	}
	
	//String reversed using the ReversedStringBuilder
	@Test
	public void reversedWithStringBuild()
	{
		String str = "Kunal Shah";
		
		
		StringBuilder st = new StringBuilder(str);
		String reversed = st.reverse().toString();
		
		System.out.println(reversed);
	
	}

	public static void main(String[] args) 
	{
		String product = test.RanPro();
		System.out.println(product);
		
		test t1 = new test();
		t1.reversedWithFor();
		
		t1.reversedWithStringBuild();
	}
}
