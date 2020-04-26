package org.testByMe;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class NewTest extends WebDriverTestCase {
  @Test
  public void f() {
	  getDriver().get("https://www.food.com");
	  QAFWebElement recipes = new QAFExtendedWebElement(By.name("q"));
	 recipes.click();
	  
  }
}
