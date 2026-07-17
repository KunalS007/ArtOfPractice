import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) {
        // Set path of ChromeDriver if required
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            
            // Open file upload page
            driver.get("https://the-internet.herokuapp.com/upload");  // sample test site

            // Locate the file input element
            WebElement uploadInput = driver.findElement(By.id("file-upload"));

            // Provide full path of the file to upload
            uploadInput.sendKeys("C:\\Users\\Kunal\\Documents\\testfile.txt");

            // Click upload button
            driver.findElement(By.id("file-submit")).click();

            // Verify upload success
            WebElement uploadedMsg = driver.findElement(By.id("uploaded-files"));
            System.out.println("Uploaded File: " + uploadedMsg.getText());

        } finally {
            driver.quit();
        }
    }
}
