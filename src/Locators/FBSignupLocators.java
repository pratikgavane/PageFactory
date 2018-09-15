package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FBSignupLocators {
	WebDriver driver;

	public FBSignupLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement ObjEnterUserName;
	
	@FindBy(xpath="//input[@name='pass']")
	public WebElement ObjEnterUserPassword;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement ObjSave;
	
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement ObjEnterUserFirstName;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement ObjEnterUserSurName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement ObjMobileNumber;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	public WebElement ObjEnterPassword;
	
	@FindBy(xpath="//*[@id='day']")//"//span[@data-name='birthday_wrapper']//select[@id='day']") 
	public Select ObjSelectDOBDay;
	
	@FindBy(xpath="//select[@id='month']")
	public Select ObjSelectDOBMonth;
	
	@FindBy(xpath="//select[@id='year']")
	public Select ObjSelectDOBYear;
	
	@FindBy(xpath="//label[contains(text(),'Male')]/preceding-sibling::*[1]")
	public WebElement ObjGenderButton;
	
	
	@FindBy(xpath="//button[@id='u_0_11']")
	public WebElement ObjSavebutton;
}
