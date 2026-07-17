package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {
	
	public static WebDriver driver;
	public static String browser;
	public static Properties Config_Prop = new Properties();
	public static InputStream input = null;
	public static WebDriverWait wait;
	public static String Screenshot_Path;
	
	public static void intiate_webdriver() {
		
		Set_Properties(Config_Prop,"Config.properties");
		
		browser=Config_Prop.getProperty("browser");
		
		
		switch(browser) {
		
		case "Firefox":
			
			 System.setProperty("webdriver.gecko.driver", Config_Prop.getProperty("gecko_path"));
			 driver = new FirefoxDriver();
			 configure_webdriver();
			break;			

		case "IE":
			System.setProperty("webdriver.ie.driver", Config_Prop.getProperty("ie_path"));
			 driver = new InternetExplorerDriver();
			 configure_webdriver();
			break;	
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", Config_Prop.getProperty("chrome_path"));
			driver = new ChromeDriver();
			configure_webdriver();
			break;	
			
		default: 
		System.setProperty("webdriver.gecko.driver", Config_Prop.getProperty("gecko_path"));
		 driver = new FirefoxDriver();
		 configure_webdriver();
		break;
		
		}	
	
}
	
	public static void configure_webdriver() {
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	}
	
	
	
public static void Set_Properties(Properties prop, String property_filename) {
		
	try {
        
		String TestData_Path = "E:\\JAVA_Automation\\Framework_Workplace\\Automation_Framework\\src\\TestData";
		String Property_FilePath=TestData_Path+"\\"+property_filename;
		
		//Load from Class Path, File needs to be put under 'src'		
		//input = Setup.class.getClassLoader().getResourceAsStream(filename);
		
		
		//Load from out of Class Path, File can be put at location of your own choice
		input = new FileInputStream(Property_FilePath);
		
		
		
		
		if(input==null){
	            System.out.println("Sorry, unable to find " + Property_FilePath);
		    return;
		}

		prop.load(input);
		
		}
	
	catch (IOException ex) {
		
		System.out.println(ex.getMessage());
	
		}
	
}
	
public static void Wait_For_Element_to_Visible(By element) {
	
	wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(element));	
}

public static void takeScreenShot(String methodName) {
	
	
	String filePath = Config_Prop.getProperty("Screenshots_Path");

	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //The below method will save the screen shot with test method name 
        try {
			FileUtils.copyFile(scrFile, new File(filePath+"//"+methodName+".png"));
			Screenshot_Path = filePath+"//"+methodName+".png";
			
			}
        
        catch (IOException e) {
			e.printStackTrace();
		}


}
}
		


