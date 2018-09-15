package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginLocators {
	
	WebDriver driver;
	public LoginLocators(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submit;
}
