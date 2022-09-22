package PageObjects;

import org.checkerframework.checker.formatter.qual.ReturnsFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	@FindBy(linkText=("Top Deals"))private WebElement topdeals;
	@FindBy(linkText=("Flight Booking"))private WebElement flightbooking;
	@FindBy(xpath=("//input[@type=\"search1\"]"))private WebElement searchbox;
   @FindBy(xpath=("//button[@type=\"submit\"]"))private WebElement searchicon;
   @FindBy(xpath=("//button[text()=\"ADD TO CART\"]"))private WebElement addtocart;
   @FindBy(xpath=("//h4[@class=\"product-name\"]"))private WebElement name;
   @FindBy(xpath=("//p[@class=\"product-price\"]"))private WebElement price;
   @FindBy(linkText=("+"))private WebElement increment;
 
   
   
   public HomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public WebElement clicktpodeal()
   {
	  return topdeals;
   }
   public WebElement Clickflightbooking()
   {
	  return flightbooking;
   }
   public WebElement clicksearchbox()
   {
	   return searchbox;
   }
   public void clickaddtocart()
   {
	   addtocart.click();
   }
   public void clickname()
   {
	   name.click();
   }
   
   public void clickicon()
   {
	   searchicon.click();
   }
}
