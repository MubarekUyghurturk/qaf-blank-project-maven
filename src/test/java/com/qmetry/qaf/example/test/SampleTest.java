package com.qmetry.qaf.example.test;


import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;
import static com.qmetry.qaf.example.steps.StepsLibrary.searchFor;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.AbstractTestCase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SampleTest extends WebDriverTestCase {
	
	
	@BeforeClass
	public void setup() {
		
		
	}
	
	
	

	@Test
	public void testGoogleSearch() {
		
		ConfigurationManager.getBundle().getProperties("env.baseurl");
		
	
		
		//String URL = ConfigurationManager.addLocal(ConfigurationManager.addBundle("env.baseurl"));
		
		//searchFor("qaf github infostretch");
		//verifyLinkWithPartialTextPresent("qaf");
	}
}
