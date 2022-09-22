package beta;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import E2ERohini.greencart.base;

public class demo extends base {

	
	private static Logger log=LogManager.getLogger(demo.class.getName());
	@Test
	public void log4jpract() throws IOException
	{
		driver=Initializedriver();
		driver.get("https://www.amazon.in/");
		log.error("launched amazon");
		log.fatal("i am fatal");
		log.debug("I am debug");
		log.info("i am infor");
	}
}
