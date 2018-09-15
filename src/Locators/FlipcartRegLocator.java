package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartRegLocator {
	WebDriver driver;

	public FlipcartRegLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.='Login & Signup']")
	public WebElement loginandSignupbtn;
	
	@FindBy(xpath="//span[text()='New to Flipkart? Sign up']")
	public WebElement Signup;
	
	
	
	
}
