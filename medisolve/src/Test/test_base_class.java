package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class test_base_class {
WebDriver driver;
	@BeforeTest
	void initialsetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION DRIVER SOFTWARE\\chromedriver_win32\\chromedriver.exe\\");
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			
	}
	@BeforeTest
  void launchURL()
  {
	  driver.get("https://vctcpune.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
	
}