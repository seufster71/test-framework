package org.toasthub.test.core.pages;

import org.toasthub.test.core.general.GeneralSettings;
import org.toasthub.test.core.selenium.Driver;

public class LoginPage {

	
	public static void login() {
		
		Driver.getInstance().get(GeneralSettings.hostWebContext+"/login/login.html");
		
		Driver.findOrWaitById("LOGIN_FORM-LOGIN_FORM_USERNAME").sendKeys("cborgAdmin");
	
		Driver.findOrWaitById("LOGIN_FORM-LOGIN_FORM_PASSWORD").sendKeys("test");
		
		Driver.findOrWaitById("LOGIN_FORM_SUBMIT_BUTTON").click();
		
		Driver.waitSeconds(1);
		
	}
}
