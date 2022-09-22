package E2ERohini.greencart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver Initializedriver() throws IOException
	{
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Rohini\\eclipse-workspace\\greencart\\resources\\Data.properties");
		prop.load(fis);
		String bname=System.getProperty("browser");
		System.out.println(bname);
		//String bname=prop.getProperty("browser");

		if(bname.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohini\\eclipse-workspace\\Seleniumfirstday\\chromedriver.exe");
		 driver =new ChromeDriver();
		}
		if(bname.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver =new FirefoxDriver();
		}
		if(bname.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		 driver=new EdgeDriver();
		
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
  public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
  {
	  TakesScreenshot ts=(TakesScreenshot)driver;
	 File src= ts.getScreenshotAs(OutputType.FILE);
	 String dest=System.getProperty("User.dir")+"//reports//"+testCaseName+".png";
  FileHandler.copy(src, new File(dest));
  return dest;
  }
}
