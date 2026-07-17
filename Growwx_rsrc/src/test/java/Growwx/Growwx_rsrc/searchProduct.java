package Growwx.Growwx_rsrc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class searchProduct extends BaseGrowx 
{
    WebDriver driver;
    searchProduct sc = new searchProduct();

    @Test
    public void login() throws IOException, InterruptedException 
    {
        driver = initlizeDriver();
        driver = loginApplication();    
    }
    
    
    @Test
    public void searchProduct()
    {
    	
    }
}

