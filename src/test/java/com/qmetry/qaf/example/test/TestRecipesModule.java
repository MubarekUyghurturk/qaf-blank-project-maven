package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;


public class TestRecipesModule extends WebDriverTestCase{
	
	
	@Test(description="Recipes Test Scenario",groups={"SMOKE"} )
	public void testRecipesDropdown() throws InterruptedException {
		
		get("/");
		System.out.println(getDriver().getTitle());
		click("recipes.click");
	
		
		
		
		
		List<QAFWebElement> links = new QAFExtendedWebElement("alldropdown.click");
		
		
		
	/*	
		
		List<WebElement> links = driver.findElements(By.xpath("  ");
			Thread.sleep(1000);
			//link.getText();
			System.out.println(link.getAttribute("textContent") + "  ");

		}
			*/
			
		}
		

	
	
	
	
	
	

	@Test
	public void testLoadButton() throws InterruptedException {
		
		get("/");
		click("recipes.click");
		QAFWebElement loadMore = new QAFExtendedWebElement("loadMore.click ");
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		
		js.executeScript("arguments[0].scrollIntoView(true)", loadMore);
		Thread.sleep(3000);
		js.executeScript("argument[0].click()",loadMore);
		Thread.sleep(3000);
		
		
		
	}

}
