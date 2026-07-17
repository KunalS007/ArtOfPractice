package SyncProject.Presentation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest 
{

	public static void main(String[] args) 
	{
		String str = "I Love Infosys";
		String wordcount = "Infosys";
		int count = 0;
		
		String[] words = str.split(" ");
		
		for(String word : words)
		{
			if(word.equals(wordcount))
			{
				count++;
			}
		}
		System.out.println("The count is " +count);
	}
}
