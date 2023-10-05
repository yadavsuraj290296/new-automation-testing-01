package POM_ORM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	
WebDriver driver;
@FindBy(xpath="//input[@placeholder='Username']")private WebElement ussername;
@FindBy (xpath="//input[@placeholder='Password']")private WebElement password;
@FindBy (xpath="//button[normalize-space()='Login']")private WebElement login;
@FindBy (xpath="//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']")private WebElement logo;

public pom1(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void enterussername(String name)

{

	ussername.sendKeys();
}
public void enterpassword()
{
	password.sendKeys("admin123");
}
public void clickloginbutton()
{
	login.click();
}
}
