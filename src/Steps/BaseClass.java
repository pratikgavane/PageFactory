package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import Locators.LoginLocators;

public class BaseClass {
	String envFileName;
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"Browser","envName"})
	public void initiate(String Browser, String envName){
		envFileName=envName;
		String url = getPropeties("url");
		switch(Browser){
		case "Chrome":
			System.out.println("Browser got invoked");
			System.out.println(Browser);
			System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;
			
		case "Firefox":
			System.out.println("Browser got invoked");
			System.out.println(Browser);
			System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/Desktop/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get(url);
			break;
			
		default : 
			System.out.println("Browser got invoked");
			System.out.println(Browser);
			System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}	
	}
	
	public String getPropeties(String key){
		
		Properties prop=new Properties();
		String value=null;
		try{
			String path=System.getProperty("user.dir")+"\\properties\\"+envFileName+".properties";
			System.out.println(path);
			File f=new File(path);
			FileReader reader=new FileReader(f);
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value=prop.getProperty(key);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return value;
	}
	
  /*  @AfterTest
    public void closing(){
    	System.out.println("Closing browser");
    	driver.close();
    }*/
    public void userType(WebElement wb, String text){
    	wb.sendKeys(text);
    }
    public void userType(Select sc, String date){
    	sc.selectByValue(date);
    }
 
    public void userClick(WebElement wb){
    	wb.click();
    }
    public static String getJsonValue(String jsonPath) throws IOException{
  	  String path=System.getProperty("user.dir")+"\\Testdata\\TestData.JSON";
  	  String jsString=new String(Files.readAllBytes(Paths.get(path)));
  	  String value=JsonPath.read(jsString,jsonPath);
  	  return value;
  	  }
}


