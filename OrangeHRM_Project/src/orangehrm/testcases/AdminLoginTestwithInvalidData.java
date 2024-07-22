package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidData
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		boolean res = lp.isErrMsgDisplayed();
		if(res)
		{
			System.out.println("Login displayed appropriate error message for invalid credentials, test pass");
		}else
		{
			System.out.println("Login displayed appropriate error message for invalid credentials, test fail");
		}
		AppUtils.closeApp();
	}

}
