package TEST_ORM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM_ORM.pom1;
import Utility_ORM.BaseClass;

public class test1 extends BaseClass
{
	@Test
	
public void sanitytesting(WebDriver driver)
{
		pom1 test1 = new pom1(driver);
		test1.enterussername("suraj");
		test1.enterpassword();
		test1.clickloginbutton();		
}


}
