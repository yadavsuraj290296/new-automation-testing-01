package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

import Test.test_base_class;

public class Take_Screenshot extends test_base_class
{WebDriver driver;
	


	
	TakesScreenshot ts =(TakesScreenshot)driver;
	
	public void takescreenshot(WebDriver driver) throws IOException
	{
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("/medisolve/screenshot\\image.jpg");
		FileHandler.copy(source,dest);
	}
	

}


