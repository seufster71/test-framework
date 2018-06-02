package org.toasthub.test.member.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.toasthub.test.member.tests.UserTests;


@RunWith(Suite.class)

@Suite.SuiteClasses({
//	ApplicationTests.class,
//	ClientDomainTests.class,
//	   LanguageTests.class,
//	   ServiceCrawlerTests.class,
//	   PreferenceTests.class,
//	   MenuTests.class,
//	   PermissionTests.class,
//	   RoleTests.class,
	   UserTests.class,
	})


public class AdminSuite {

}
