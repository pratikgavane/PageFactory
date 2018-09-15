package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.LoginLocators;

public class LoginScript extends BaseClass{

	public static void main(String[] args) {
		System.out.println("Browser got invoked");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LoginLocators l=new LoginLocators(driver);
		driver.get("https://www.facebook.com/");
		l.username.sendKeys("Pratikgavane@gmail.com");
		l.password.sendKeys("sdadad");
		l.submit.click();
	}
}
