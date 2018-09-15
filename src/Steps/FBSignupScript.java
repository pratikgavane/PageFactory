package Steps;


import java.io.IOException;
import org.testng.annotations.Test;


import Locators.FBSignupLocators;

public class FBSignupScript extends BaseClass{
  @Test
  public void registatrion() throws IOException  {
	  FBSignupLocators fbl=new FBSignupLocators(driver);
	  System.out.println(getJsonValue("$.fbSignup.fname"));
	  userType(fbl.ObjEnterUserFirstName,getJsonValue("$.fbSignup.fname"));
	  userType(fbl.ObjEnterUserSurName, getJsonValue("$.fbSignup.lname"));
	  userType(fbl.ObjMobileNumber,getJsonValue("$.fbSignup.mobileno"));
	  userType(fbl.ObjEnterPassword, getJsonValue("$.fbSignup.NewPassword"));
	  userType(fbl.ObjSelectDOBDay, getJsonValue("$.fbSignup.bdate"));
  }

}
