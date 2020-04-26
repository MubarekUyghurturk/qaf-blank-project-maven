package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

import static com.qmetry.qaf.automation.step.CommonStep.*;



public class Suite1 extends WebDriverTestCase{
	
	
	@Test(description="Sample Test Scenario",groups={"SMOKE"} )
	public void testGoogleSearch(){
		get("/");
		sendKeys("Git repository QAF","txt.searchbox");
		
		
		QAFWebElement searchBox = new QAFExtendedWebElement("btn.search");
		searchBox.click();
		//click("btn.search");
		verifyLinkWithPartialTextPresent("qaf");
		
		
	}
	
	

}
