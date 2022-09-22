package E2ERohini.greencart;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class basepagenavigationTest extends base {
	
	
	private static Logger log=LogManager.getLogger(basepagenavigationTest.class.getName());
	public WebDriver driver;
	@BeforeMethod
	public void startbrowser() throws IOException
	{
		driver=Initializedriver();
		driver.get(prop.getProperty("url"));
		log.debug("url opened");
	}
	
	@Test
	public void searchitem()
	{
		HomePage hp=new HomePage(driver);
		hp.clicksearchbox().sendKeys("Tomato");
		hp.clickicon();
		log.error("tomato searched");
	}
	
	@Test
	public void clicktopdeal() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clicktpodeal().click();
		Thread.sleep(5000);
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
	System.out.println(	driver.getCurrentUrl());
	String actualtitle=driver.getTitle();
	String ExpectedTitle="GreenKart - veg and fruits kart";
	Assert.assertEquals(actualtitle, ExpectedTitle);
	log.info("title matched");
	
		
		
	}
	
	@Test
	public void clickflightdetails()
	{
		HomePage hp=new HomePage(driver);
		hp.Clickflightbooking().click();
		log.fatal("flights are fatal");
		
	}
	
	@AfterMethod
	public void closedriver()
	{
		driver.close();
	}
	
}
