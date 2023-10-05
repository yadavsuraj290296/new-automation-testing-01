package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.HomePgaeObjects;
import Utility.Take_Screenshot;

public class Home_page_test extends test_base_class
{
	HomePgaeObjects Pageobj;

	@BeforeTest
	void initObject() {
		 Pageobj=new HomePgaeObjects(driver);
		
	}
	
  @Test(priority=1)
  void TestURL()
  {
	 String actualurl= driver.getCurrentUrl();
	 Assert.assertEquals(actualurl,"https://vctcpune.com/","url is succesfull login");
	  
  }
  @Test(priority=2)
  void Testlogo()
  {
	   Pageobj=new HomePgaeObjects(driver);
	  Pageobj.closepopups();
	  boolean act=Pageobj.Logoprsent();
	  Assert.assertTrue(act,"logo test successfull");
  }
//  @Test(priority=4)
//  void courseTabtest() {
//	 Assert.assertTrue(Pageobj.CourceTabPresent(),"coursetab is present");
//	 Pageobj.coursetabClick();
//	Assert.assertTrue(Pageobj.CourceTabPresent());
//  }
  
  @Test(priority=3)
  
	  void contactinfo() {
	  Pageobj=new HomePgaeObjects(driver);
	  Pageobj.concttclick();
	  Pageobj.name("suraj");
	  
 }
  
  
 @AfterTest
 void sshot() throws IOException {
 Take_Screenshot s1 =new Take_Screenshot();
 s1.takescreenshot(driver);
 }
//  void closeBrouser(
//  {
//	  driver.quit();
//  }
  
  
}
