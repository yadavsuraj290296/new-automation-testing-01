package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePgaeObjects {
	WebDriver driver;
	
	@FindBy(xpath="//img[@alt='Logo']")
	private WebElement velocityLogo;
	
	@FindBy (xpath="//button[@class='react-responsive-modal-closeButton']")
	private WebElement hompops;
	
	@FindBy (xpath="(//div[@class='mobileVersion'])[1]")
	private WebElement CourseTab;
	@FindBy (xpath="(//a[@title='Contact Us'])[1]")private WebElement contact;
	
	@FindBy (xpath="//input[@name='name']")private WebElement name;
	
	public boolean  Logoprsent()
	{
		boolean logo=velocityLogo.isDisplayed();
		return logo;
	}
	public void logoclick()
	{
		velocityLogo.click();
	}
	public void closepopups()
	{
		if(hompops.isDisplayed())
{
		hompops.click();
}
		else {
			System.out.println("popup is not displyed");
		}
	}
	
	public boolean CourceTabPresent() {
		boolean coursetab=CourseTab.isDisplayed();
		return coursetab;
		
	}
	public void coursetabClick() {
		CourseTab.click();
	}
	public void concttclick()
	{
		contact.click();
	}
	public void name(String input)
	{
		name.sendKeys(input);
		
	}
	
	public HomePgaeObjects(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
}
