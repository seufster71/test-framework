package org.toasthub.test.core.tests;

import org.junit.Assert;
import org.junit.Test;
import org.toasthub.test.core.general.BaseTests;
import org.toasthub.test.core.pages.LoginPage;
import org.toasthub.test.member.pages.MemberArea;


public class LoginTests extends BaseTests {

	
	@Test
	public void loginTest(){
		LoginPage.login();
		
		Assert.assertEquals(true,MemberArea.IsAt());
	}

}
