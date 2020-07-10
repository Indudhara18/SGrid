package grids;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/*
 * This class is used to do Compatibility Testing
 */

public class Demo1 
{
	@Test
	public void test_Compatibility() throws MalformedURLException
	{								// my ip address , my laptop is node here ie Grid version 1		
		 URL nodeUrl = new URL("http://192.168.43.130:4444/wd/hub");
		 					  //protocol , ipaddress , port,flavour,hub
		 
		 DesiredCapabilities ds = new DesiredCapabilities();
		 ds.setBrowserName("firefox");
		 
		 RemoteWebDriver driver = new RemoteWebDriver(nodeUrl, ds);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://www.google.com");
		 
		 driver.findElement(By.name("q")).sendKeys("job");
	}
	
}
