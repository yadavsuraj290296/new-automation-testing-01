package Utility_ORM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void setupmethod()
	{
	System.setProperty("webdriver.chrome.driver","C:\\maven project\\Driver_browser\\chromedriver.exe\\");
	ChromeOptions opt =new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	driver=new ChromeDriver(opt);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
}
}