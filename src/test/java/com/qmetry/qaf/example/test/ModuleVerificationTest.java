package com.qmetry.qaf.example.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import static com.qmetry.qaf.automation.step.CommonStep.*;



public class ModuleVerificationTest extends WebDriverTestCase {
	
	@Test(description="Recipes Test Scenario",groups={"SMOKE"} )
	public void testRecipes() {
		
		get("/");
		System.out.println(getDriver().getTitle());
		click("recipes.click");
		
		QAFWebElement recipesHeader = new QAFExtendedWebElement("recipes.header");
		String headerValue = recipesHeader.getAttribute("textContent");
		Assert.assertTrue(headerValue.equalsIgnoreCase(headerValue),"RECIPES");
		
		
	}
	
	
	
	@Test(description="Popular Test Scenario",groups = {"SMOKE"})
	public void testPopular() throws InterruptedException {
		//get("/");
	    //System.out.println(getDriver().getTitle());
		Thread.sleep(1000);
		click("popular.click");
		
		QAFWebElement topHeader = new QAFExtendedWebElement("recipes.header");
		String topValue = topHeader.getAttribute("textContent");
		Assert.assertTrue(topValue.equalsIgnoreCase(topValue),"Top-Rated Recipes");
		
		
	}
	
	
	
	@Test(description="Spring Test Scenario",groups = {"SMOKE"})
	public void springTest() throws InterruptedException {
		//get("/");
	    //System.out.println(getDriver().getTitle());
		Thread.sleep(1000);
		click("spring.click");
		
		QAFWebElement topHeader = new QAFExtendedWebElement("spring.header");
		String topValue = topHeader.getAttribute("textContent");
		Assert.assertTrue(topValue.equalsIgnoreCase(topValue),"Spring");
		
		
	}
	
	
	
	
	
	

}
