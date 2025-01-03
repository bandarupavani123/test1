package mavenproject0.mpo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartTest {
	
	@Test
	public void flikartLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\banda\\Pavani123\\mpo\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com");
	   String pageTitle = driver.getTitle();
	   System.out.println("Home page title is :::: " + pageTitle);

	  //close the browser
	   driver.quit();
}
}

