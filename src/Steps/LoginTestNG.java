package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Locators.LoginLocators;

public class LoginTestNG extends BaseClass {
  @Test
  public void Login() {
	 
		LoginLocators l=new LoginLocators(driver);
		userType(l.username, getPropeties("email"));
		userType(l.password, getPropeties("password"));
		userClick(l.submit);
		/*l.username.sendKeys(getPropeties("email"));
		l.password.sendKeys(getPropeties("password"));
		l.submit.click();*/
		
		
  }
}
