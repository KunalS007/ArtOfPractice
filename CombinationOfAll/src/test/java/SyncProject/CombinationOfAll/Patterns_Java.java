package SyncProject.CombinationOfAll;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/* 1. Right Pyramid pattern
 * 2. Left Pyramid pattern
 * 3. Reverse Right Half Pyramid
 * 4. Reverse left Half Pyramid
 * 5. Hill Pyramid
 * 6. Hill Reverse Pyramid
 * 7. Diamond Pyramid
 */

public class Patterns_Java 
{
	//1. RightPyramid pattern
	
	//@Test
	public static void rightPyramid(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 2. LeftPyramid pattern
	@Test
	public static void leftPyramid(int n)
	{ 
		int i, j; 

		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		} 

	//3.  Reverse Right Half Pyramid
	@Test
	public static void reverseRightHalfPyramid(int n)
	{ 
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//4.  Reverse left Half Pyramid
	@Test
	public static void ReverseLeftHalfPyramid(int n) 
	{
		for (int i = 0; i < n; i++) 
		{
	       for (int j = 0; j < i; j++) 
	       {
	          System.out.print(" ");
	       }
	       for (int k = i; k < n; k++)
	        {
	           System.out.print("*");
	        }
	       		System.out.println();
	     }
	 }
	
	//5. Hill Pyramid
	@Test
	public static void hillPyramid(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++) //for space loop
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//6. Hill Reverse Pyramid
	public static void hillReversePyramid(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void diamondPyramid(int n) 
	{
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	
	public static void main(String args[]) 
	{
		int n=6;
//		rightPyramid(n);
//		leftPyramid(n);
//		reverseRightHalfPyramid(n);
//		ReverseLeftHalfPyramid(n);
//		hillPyramid(n);
		hillReversePyramid(n);
//		diamondPyramid(n);
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Kunal S\\Downloads\\chromedriver_win32");
		Capabilities capabilities = DesiredCapabilities.chrome();
		System.out.println("Selenium Version: " + capabilities.getVersion());
	}
}
